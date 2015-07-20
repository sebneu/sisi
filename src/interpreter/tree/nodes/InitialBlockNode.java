package interpreter.tree.nodes;

import interpreter.tree.values.Value;

import java.util.ArrayList;
import java.util.List;

public class InitialBlockNode implements Node {
    private List<Node> initNodes;

    public InitialBlockNode() {
	initNodes = new ArrayList<Node>();
    }

    public void addInitialization(Node n) {
	initNodes.add(n);
    }

    @Override
    public Value eval() {
	for (Node init : initNodes) {
	    Value value = init.eval();
	    if (value == Value.HALT) {
		throw new RuntimeException("halt statement not allowed in init block");
	    }
	    if (value == Value.NULL) {
		throw new RuntimeException("null value returned in initial statement " + init);
	    }
	}
	return Value.VOID;
    }

    @Override
    public String toString() {
	StringBuilder b = new StringBuilder();
	b.append("INITIALIZATION\n");
	for (Node init : initNodes) {
	    b.append(init).append("\n");
	}
	return b.toString() + "\n";
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();

	b.append("\\FuncSty{\\bf{Init}}\\;\n");
	for (Node init : initNodes) {
	    b.append(init.toLatexAlgorithmic()).append("\n");
	}
	return b.toString();
    }
}
