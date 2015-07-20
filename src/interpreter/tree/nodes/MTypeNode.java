package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.values.MTypeValue;
import interpreter.tree.values.Value;

public class MTypeNode implements Node {

    private String identifier;
    private Scope scope;

    public MTypeNode(String id, MTypeDeclarationNode mtypes, Scope scope) {
	this.scope = scope;
	this.identifier = id;
	mtypes.addMType(id);
    }

    @Override
    public Value eval() {
	Value v = scope.resolve(identifier);
	if (v == null) {
	    throw new RuntimeException("cannot resolve value of " + identifier);
	}
	if (!(v instanceof MTypeValue)) {
	    throw new RuntimeException("not a valid value of mtype "
		    + identifier);
	}
	return v;
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
