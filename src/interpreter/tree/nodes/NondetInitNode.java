package interpreter.tree.nodes;

import interpreter.tree.LambdaExpr;
import interpreter.tree.values.Value;

public class NondetInitNode implements Node {

    private NondetValueNode value;
    private LambdaExpr lambdaExpr;

    public NondetInitNode() {
	value = new NondetValueNode();
    }

    public void addNondetValue(Node n) {
	value.addValue(n);
    }

    public void addNondetRange(Node a, Node b) {
	int start = a.eval().asInteger();
	int end = b.eval().asInteger();
	for (int i = start; i <= end; i++) {
	    value.addValue(new AtomNode(i));
	}
    }

    @Override
    public Value eval() {
	return lambdaExpr.some(value);
    }

    public void setLambdaExpr(LambdaExpr lambdaExpr) {
	this.lambdaExpr = lambdaExpr;
    }

    @Override
    public String toString() {
	return String.format("(SOME %sFROM %s)", lambdaExpr, value);
    }

    @Override
    public String toLatexAlgorithmic() {
	String le = lambdaExpr.toLatexAlgorithmic();
	if (!le.isEmpty()) {
	    return String.format("%s.some(%s)", value, lambdaExpr);
	}
	return String.format("\\{%s\\}", value.toLatexAlgorithmic());
    }
}
