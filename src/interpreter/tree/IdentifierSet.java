package interpreter.tree;

import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

import java.util.Set;

public class IdentifierSet implements SetNode {

    private String setID;
    private Scope scope;

    public IdentifierSet(String id, Scope currentScope) {
	this.setID = id;
	this.scope = currentScope;
    }

    @Override
    public Set<Tuple> eval() {
	Value s = scope.resolve(setID);
	if (s == null) {
	    throw new RuntimeException("no set '" + setID + "' declared");
	}
	TupleSet set = s.asSet();
	if (set == null) {
	    throw new RuntimeException(setID + " is not a set");
	}
	return set;
    }

    @Override
    public String toString() {
	return setID;
    }
}
