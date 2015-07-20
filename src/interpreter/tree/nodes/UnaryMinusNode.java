package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class UnaryMinusNode implements Node {

    private Node exp;

    public UnaryMinusNode(Node e) {
        exp = e;
    }

    @Override
    public Value eval() {

	Value v = exp.eval();

        if(!v.isInteger()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new Value(-v.asInteger());
    }

    @Override
    public String toString() {
        return String.format("(-%s)", exp);
    }

    @Override
    public String toLatexAlgorithmic() {
        return String.format("-%s", exp.toLatexAlgorithmic());
    }
}