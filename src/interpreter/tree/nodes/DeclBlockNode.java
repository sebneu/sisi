package interpreter.tree.nodes;

import interpreter.tree.values.Value;

import java.util.ArrayList;
import java.util.List;

public class DeclBlockNode implements Node {
    private List<Node> declNodes;

    public DeclBlockNode() {
	declNodes = new ArrayList<Node>();
    }

    public void addDeclaration(Node n) {
	declNodes.add(n);
    }

    @Override
    public Value eval() {
	for (Node init : declNodes) {
	    Value value = init.eval();
	    if (value == Value.HALT) {
		throw new RuntimeException("halt statement not allowed in variables block");
	    }
            if(value != Value.VOID) {
                return value;
            }
	}
	return Value.VOID;
    }

    @Override
    public String toString() {
	StringBuilder b = new StringBuilder();
	b.append("DECLARATION\n");
	for (Node init : declNodes) {
	    b.append(init).append("\n");
	}
	return b.toString() + "\n";
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();

	b.append("\\FuncSty{\\bf{Variables}}\\;\n");
	for (Node decl : declNodes) {
	    b.append(decl.toLatexAlgorithmic()).append("\n");
	}
	return b.toString();
    }
}
