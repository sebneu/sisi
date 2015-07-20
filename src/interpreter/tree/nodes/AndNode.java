package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class AndNode extends BinaryNode {

    public AndNode(Node left, Node right) {
	super(left, right);
    }

    @Override
    public Value eval() {

	Value a = left.eval();
	Value b = right.eval();

	if (a.isBoolean() && b.isBoolean()) {
	    return new Value(a.asBoolean() && b.asBoolean());
	}

	throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
	return String.format("(%s AND %s)", left, right);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s \\wedge %s", left.toLatexAlgorithmic(),
		right.toLatexAlgorithmic());
    }
}