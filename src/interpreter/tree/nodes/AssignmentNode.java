package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.values.Value;

public class AssignmentNode implements Node {

    protected String identifier;
    protected Node rhs;
    protected Scope scope;

    public AssignmentNode(String i, Node n, Scope s) {
	identifier = i;
	rhs = n;
	scope = s;
    }

    @Override
    public Value eval() {

	Value value = rhs.eval();

	if (value == Value.VOID) {
	    throw new RuntimeException("can't assign VOID to " + identifier);
	}

	// a simple assignment
	scope.assign(identifier, value);

	return Value.VOID;
    }

    @Override
    public String toString() {
	return String.format("(%s = %s)", identifier, rhs);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("$%s \\leftarrow %s$\\;", identifier, rhs.toLatexAlgorithmic());
    }
}
