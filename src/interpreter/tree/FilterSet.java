package interpreter.tree;

import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

import java.util.Set;

public class FilterSet implements SetNode {
    private String setID;
    private LambdaExpr lambdaExpr;
    private Scope scope;

    public FilterSet(String id, LambdaExpr lambdaExpr, Scope scope) {
	this.setID = id;
	this.lambdaExpr = lambdaExpr;
	this.scope = scope;
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
	return lambdaExpr.filter(set);
    }

    @Override
    public String toString() {
	return String.format("(FILTER %s IN %s)", lambdaExpr, setID);
    }
    
    public String toLatexAlgorithmic() {
	return String.format("%s.filter(%s)", setID, lambdaExpr);
    }
}
