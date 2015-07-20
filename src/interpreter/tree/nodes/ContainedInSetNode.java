package interpreter.tree.nodes;

import java.util.Set;

import interpreter.tree.FilterSet;
import interpreter.tree.Scope;
import interpreter.tree.TupleSet;
import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class ContainedInSetNode implements BoolExpressionOnSetNode {
    private String setID;
    private Scope scope;
    private TupleNode tuple;
    private FilterSet filterSet = null;

    public ContainedInSetNode(TupleNode tupleNode, Scope scope) {
	this.tuple = tupleNode;
	this.scope = scope;
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
	    return new Value(set.contains(tuple));
	} else if (filterSet != null) {
	    // evaluate with filtered set
	    Set<Tuple> set = filterSet.eval();
	    Tuple t = tuple.eval();
	    for (Tuple setTuple : set) {
		if (setTuple.equals(t)) {
		    return new Value(true);
		}
	    }
	    return new Value(false);
	} else {
	    throw new RuntimeException("set not specified");
	}
    }

    @Override
    public void set(String set) {
	this.setID = set;
    }

    @Override
    public void set(FilterSet filterSet) {
	this.filterSet = filterSet;
    }

    @Override
    public String toString() {
	if (setID != null) {
	    return String.format("(%s CONTAINS %s)", setID, tuple);
	} else if (filterSet != null) {
	    return String.format("(%s CONTAINS %s)", filterSet, tuple);
	} else {
	    throw new RuntimeException("set not specified");
	}
    }

    @Override
    public String toLatexAlgorithmic() {
	if (setID != null) {
	    return String.format("%s.contains(%s)", setID, tuple.toLatexAlgorithmic());
	} else if (filterSet != null) {
	    return String.format("%s.contains(%s)", filterSet.toLatexAlgorithmic(), tuple.toLatexAlgorithmic());
	} else {
	    throw new RuntimeException("set not specified");
	}
    }
}