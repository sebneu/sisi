package interpreter.tree;

import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class AccessSet {
    private String setID;
    private LambdaExpr lambdaExpr;
    private Scope scope;

    public AccessSet(String id, LambdaExpr lambdaExpr, Scope scope) {
	this.setID = id;
	this.lambdaExpr = lambdaExpr;
	this.scope = scope;
    }

    public Tuple eval() {
	Value s = scope.resolve(setID);
	if (s == null) {
	    throw new RuntimeException("no set '" + setID + "' declared");
	}
	TupleSet set = s.asSet();
	if (set == null) {
	    throw new RuntimeException(setID + " is not a set");
	}
	return lambdaExpr.some(set);
    }

    @Override
    public String toString() {
	return String.format("(SOME %s IN %s)", lambdaExpr, setID);
    }

    public String toLatexAlgorithmic() {
	return String.format("%s.some(%s)", setID,
		lambdaExpr.toLatexAlgorithmic());
    }
}
