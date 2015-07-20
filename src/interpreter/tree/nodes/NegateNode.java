package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class NegateNode implements Node {

    private Node exp;

    public NegateNode(Node e) {
        exp = e;
    }

    @Override
    public Value eval() {

	Value v = exp.eval();

        if(!v.isBoolean()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new Value(!v.asBoolean());
    }

    @Override
    public String toString() {
        return String.format("(!%s)", exp);
    }

    @Override
    public String toLatexAlgorithmic() {
        return String.format("\\neg%s", exp);
    }
}