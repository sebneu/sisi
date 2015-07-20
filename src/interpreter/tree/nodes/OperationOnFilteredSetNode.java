package interpreter.tree.nodes;

import interpreter.tree.FilterSet;
import interpreter.tree.values.Value;

public class OperationOnFilteredSetNode implements Node {
    private BoolExpressionOnSetNode expressionOnSet;
    
    public OperationOnFilteredSetNode(FilterSet filterSet, BoolExpressionOnSetNode operationOnSet) {
	this.expressionOnSet = operationOnSet;
	this.expressionOnSet.set(filterSet);
    }
    
    @Override
    public Value eval() {
	return expressionOnSet.eval();
    }

    @Override
    public String toString() {
	return expressionOnSet.toString();
    }
    
    @Override
    public String toLatexAlgorithmic() {
	return expressionOnSet.toLatexAlgorithmic();
    }
}
