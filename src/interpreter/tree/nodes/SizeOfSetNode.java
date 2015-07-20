package interpreter.tree.nodes;

import interpreter.tree.FilterSet;
import interpreter.tree.Scope;
import interpreter.tree.TupleSet;
import interpreter.tree.values.Value;

public class SizeOfSetNode implements BoolExpressionOnSetNode {
    private String setID;
    private Scope scope;
    private FilterSet filterSet = null;

    public SizeOfSetNode(Scope currentScope) {
	this.scope = currentScope;
    }

    @Override
    public Value eval() {
	if (setID != null) {
	    // evaluate with set identifier
	    Value s = scope.resolve(setID);
	    if (s == null) {
		throw new RuntimeException("no set '" + setID + "' declared");
	    }
	    TupleSet set = s.asSet();
	    if (set == null) {
		throw new RuntimeException(setID + " is not a set");
	    }
	    return new Value(set.size());
	} else if (filterSet != null) {
	    // evaluate with filtered set
	    return new Value(filterSet.eval().size());
	} else {
	    throw new RuntimeException("set not specified");
	}
    }

    @Override
    public void set(String setId) {
	this.setID = setId;
    }

    @Override
    public void set(FilterSet filterSet) {
	this.filterSet = filterSet;
    }

    @Override
    public String toString() {
	if (setID != null) {
	    return String.format("(SIZE OF %s)", setID);
	} else if (filterSet != null) {
	    return String.format("(SIZE OF %s)", filterSet);
	} else {
	    throw new RuntimeException("set not specified");
	}
    }

    @Override
    public String toLatexAlgorithmic() {
	if (setID != null) {
	    return String.format("%s.size", setID);
	} else if (filterSet != null) {
	    return String.format("%s.size", filterSet.toLatexAlgorithmic());
	} else {
	    throw new RuntimeException("set not specified");
	}
    }
}