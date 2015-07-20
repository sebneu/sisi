package interpreter.tree.nodes;

import interpreter.tree.values.EnumValue;
import interpreter.tree.values.Value;

public class NEqNode extends BinaryNode {

    public NEqNode(Node left, Node right) {
	super(left, right);
    }


    @Override
    public Value eval() {

	Value a = left.eval();
	Value b = right.eval();

	if (a.isInteger() && b.isInteger()) {
	    return new Value(a.asInteger() != b.asInteger());
	}

	if (a.isBoolean() && b.isBoolean()) {
	    return new Value(a.asBoolean() != b.asBoolean());
	}
	
	if (a instanceof EnumValue && b instanceof EnumValue) {
	    return new Value(a.asInteger() != b.asInteger());
	}

	throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
	return String.format("(%s != %s)", left, right);
    }


    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s \\neq %s", left.toLatexAlgorithmic(), right.toLatexAlgorithmic());
    }
}
