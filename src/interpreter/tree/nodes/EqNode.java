package interpreter.tree.nodes;

import interpreter.tree.values.EnumValue;
import interpreter.tree.values.Value;

public class EqNode extends BinaryNode {

    public EqNode(Node left, Node right) {
	super(left, right);
    }

    @Override
    public Value eval() {

	Value a = left.eval();
	Value b = right.eval();

	if (a.isBoolean() && b.isBoolean()) {
	    return new Value(a.asBoolean() == b.asBoolean());
	}

	if (a.isInteger() && b.isInteger()) {
	    return new Value(a.asInteger() == b.asInteger());
	}

	if (a instanceof EnumValue && b instanceof EnumValue) {
	    return new Value(((EnumValue) a).equals((EnumValue) b));
	}

	if (a.isSet() || b.isSet()) {
	    throw new RuntimeException("illegal expression: " + this
		    + ". Cannot compare " + a + " and " + b + ".");
	}

	return new Value(false);
    }

    @Override
    public String toString() {
	return String.format("(%s == %s)", left, right);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s = %s", left, right);
    }
}
