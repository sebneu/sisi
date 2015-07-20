package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class ModNode extends BinaryNode {

    public ModNode(Node l, Node r) {
	super(l, r);
    }

    @Override
    public Value eval() {

	Value a = left.eval();
	Value b = right.eval();

	if (a.isInteger() && b.isInteger()) {
	    return new Value(a.asInteger() % b.asInteger());
	}

	throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
	return String.format("(%s % %s)", left, right);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s % %s", left.toLatexAlgorithmic(),
		right.toLatexAlgorithmic());
    }

}
