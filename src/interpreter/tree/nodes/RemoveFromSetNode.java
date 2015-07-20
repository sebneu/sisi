package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.TupleSet;
import interpreter.tree.values.Value;

public class RemoveFromSetNode  implements OperationOnSetNode {
    private String setID;
    private Scope scope;
    private TupleNode tupleNode;

    public RemoveFromSetNode(TupleNode tupelNode, Scope scope) {
	this.tupleNode = tupelNode;
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
	
	return new Value(set.remove(tupleNode.eval()));
    }

    @Override
    public void set(String set) {
	this.setID = set;	
    }

    @Override
    public String toString() {
	return String.format("(REMOVE %s FROM %s)", tupleNode, setID);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("%s.remove($%s$)", setID, tupleNode.toLatexAlgorithmic());
    }
}