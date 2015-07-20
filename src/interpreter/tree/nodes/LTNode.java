package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class LTNode extends BinaryNode {

    public LTNode(Node left, Node right) {
	super(left, right);
    }

    @Override
    public Value eval() {

	Value a = left.eval();
	Value b = right.eval();

	if (a.isInteger() && b.isInteger()) {
	    return new Value(a.asInteger() < b.asInteger());
	}

	throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
	return String.format("(%s < %s)", left, right);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s < %s", left.toLatexAlgorithmic(),
		right.toLatexAlgorithmic());
    }
}
