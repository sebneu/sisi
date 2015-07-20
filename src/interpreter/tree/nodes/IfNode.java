package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class IfNode implements Node {

    private Node test;
    private Node ifTrue;
    private Node ifFalse;

    public IfNode(Node a, Node b, Node c) {
	test = a;
	ifTrue = b;
	ifFalse = c;
    }

    @Override
    public Value eval() {

	Value value = test.eval();

	if (!value.isBoolean()) {
	    throw new RuntimeException("illegal boolean expression "
		    + "inside if-statement: " + test);
	}

	if (value.asBoolean()) {
	    if (ifTrue != null) {
		return ifTrue.eval();
	    }
	} else if (ifFalse != null) {
	    return ifFalse.eval();
	}
	return Value.VOID;
    }

    @Override
    public String toString() {
	return ifFalse == null ? String.format("(IF %s THEN %s)", test, ifTrue)
		: String.format("IF %s THEN %s ELSE %s", test, ifTrue, ifFalse);
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();
	b.append(String.format("\\If{$%s$}", test.toLatexAlgorithmic()));
	b.append("\n");
	b.append("{" + ifTrue.toLatexAlgorithmic() + "}").append("\n");
	if (ifFalse != null) {
	    b.append("\\Else");
	    b.append("{" + ifFalse.toLatexAlgorithmic() + "}").append("\n");
	}	
	return b.toString();
    }

}