package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.types.MType;
import interpreter.tree.types.Type;
import interpreter.tree.values.MTypeValue;
import interpreter.tree.values.Value;

import java.util.HashSet;
import java.util.Set;

public class MTypeDeclarationNode implements Node {
    private Scope scope;
    private Set<String> mtypes;

    public MTypeDeclarationNode(Scope currentScope) {
	this.scope = currentScope;
	this.mtypes = new HashSet<String>();
    }

    public boolean addMType(String type) {
	return this.mtypes.add(type);
    }

    public boolean isDeclared(String typeId) {
	return this.mtypes.contains(typeId);
    }

    @Override
    public Value eval() {
	// assign int values to mtype entries
	int i = 0;
	for(String v: mtypes) {
	    Type t = new MType();
	    scope.declare(v, t);
	    scope.assign(v, new MTypeValue(t, v, i));
	    i++;
	}
	return Value.VOID;
    }

    @Override
    public String toLatexAlgorithmic() {
	return "mtypes: " + mtypes;
    }
}
