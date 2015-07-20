package interpreter.tree.nodes;

import interpreter.tree.values.Value;

import java.util.ArrayList;
import java.util.List;

public class BlockNode implements Node {

    private List<Node> statements;

    public BlockNode() {
        statements = new ArrayList<Node>();
    }

    public void addStatement(Node stat) {
        statements.add(stat);
    }

    @Override
    public Value eval() {
        for(Node stat : statements) {
            Value value = stat.eval();
            if(value == Value.HALT) {
                return value;
            }
        }
        return Value.VOID;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for(Node stat : statements) {
            b.append(stat);
        }
        return b.toString();
    }

    @Override
    public String toLatexAlgorithmic() {
        StringBuilder b = new StringBuilder();
        for(Node stat : statements) {
	    b.append(stat.toLatexAlgorithmic()).append("\n");
        }
        return b.toString();
    }
}
