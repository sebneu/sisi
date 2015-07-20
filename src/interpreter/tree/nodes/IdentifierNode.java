package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.values.Value;

public class IdentifierNode implements Node {

    private String identifier;
    private Scope scope;

    public IdentifierNode(String id, Scope s) {
	identifier = id;
	scope = s;
    }

    @Override
    public Value eval() {
	Value value = scope.resolve(identifier);
	if (value == null) {
	    throw new RuntimeException("no such variable: " + this);
	}
	return value;
    }

    @Override
    public String toString() {
	return identifier;
    }

    @Override
    public String toLatexAlgorithmic() {
	return this.toString();
    }
}
