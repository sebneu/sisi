package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class AddNode extends BinaryNode {

    public AddNode(Node left, Node right) {
	super(left, right);
    }

    @Override
    public Value eval() {

	Value a = left.eval();
	Value b = right.eval();

	// number + number
	if (a.isInteger() && b.isInteger()) {
	    return new Value(a.asInteger() + b.asInteger());
	}

	throw new RuntimeException("illegal expression: " + this
		+ ". Cannot add " + a + " and " + b + ".");
    }

    @Override
    public String toString() {
	return String.format("(%s + %s)", left, right);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s + %s", left.toLatexAlgorithmic(),
		right.toLatexAlgorithmic());
    }
}
