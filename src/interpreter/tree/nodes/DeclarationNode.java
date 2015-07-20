package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.types.Type;
import interpreter.tree.values.Value;

public class DeclarationNode implements Node {

    protected String identifier;
    protected Type type;
    protected Scope scope;

    public DeclarationNode(String i, Type t, Scope s) {
	identifier = i;
	type = t;
	scope = s;
    }

    @Override
    public Value eval() {

	// a simple declaration
	scope.declare(identifier, type);

	return Value.VOID;
    }

    @Override
    public String toString() {
	return String.format("(%s %s)", type, identifier);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s %s\\;", type, identifier);
    }
}
