package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.TupleSet;
import interpreter.tree.values.Value;

public class InsertInSetNode implements OperationOnSetNode {
    private String setID;
    private Scope scope;
    private TupleNode tuple;

    public InsertInSetNode(TupleNode tupleNode, Scope scope) {
	this.tuple = tupleNode;
	this.scope = scope;
    }

    @Override
    public Value eval() {
	Value s = scope.resolve(setID);
	if (s == null) {
	    throw new RuntimeException("no set '" + setID + "' declared");
	}
	TupleSet set = s.asSet();
	if (set == null) {
	    throw new RuntimeException(setID + " is not a set");
	}
	return new Value(set.add(tuple));
    }

    @Override
    public void set(String set) {
	this.setID = set;
    }

    @Override
    public String toString() {
	return String.format("(INSERT %s IN %s)", tuple, setID);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s.insert(%s)\\;", setID,
		tuple.toLatexAlgorithmic());
    }
}
