package interpreter.tree.nodes;

import interpreter.tree.values.Value;

import java.util.ArrayList;
import java.util.List;

public class StepBlockNode implements Node {
    private List<Node> statements;

    public StepBlockNode() {
	statements = new ArrayList<Node>();
    }

    public void addStatement(Node n) {
	statements.add(n);
    }

    @Override
    public Value eval() {
	for (Node step : statements) {
	    Value value = step.eval();
            if(value == Value.HALT) {
                return value;
            }
	}
	return Value.VOID;
    }

    @Override
    public String toString() {
	StringBuilder b = new StringBuilder();
	b.append("STEP\n");
	for (Node step : statements) {
	    b.append(step).append("\n");
	}
	return b.toString() + "\n";
    }    
    
    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();

	b.append("\\FuncSty{\\bf{Step}}\\;\n");
	for (Node stat : statements) {
	    b.append(stat.toLatexAlgorithmic()).append("\n");
	}
	return b.toString();
    }
}