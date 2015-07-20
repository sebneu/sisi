package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.values.Value;

public class PreDecrementNode implements Node {

    private String identifier;
    private Scope scope;

    public PreDecrementNode(String id, Scope s) {
	identifier = id;
	scope = s;
    }

    @Override
    public Value eval() {

	Value v = scope.resolve(identifier);

        if(!v.isInteger()) {
            throw new RuntimeException("illegal expression: " + this);
        }
        scope.assign(identifier, new Value(v.asInteger()-1));
        return new Value(v.asInteger()-1);
    }

    @Override
    public String toString() {
        return String.format("(--%s)", identifier);
    }

    @Override
    public String toLatexAlgorithmic() {
        return String.format("$--%s$\\;", identifier);
    }
}