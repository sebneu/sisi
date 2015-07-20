package interpreter.tree.nodes;

import java.util.Set;

import interpreter.tree.Scope;
import interpreter.tree.SetNode;
import interpreter.tree.TupleSignatur;
import interpreter.tree.types.BooleanType;
import interpreter.tree.types.IntegerType;
import interpreter.tree.types.SetType;
import interpreter.tree.values.EnumValue;
import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class ForEachNode implements Node {

    private TupleSignatur tupleSignatur;
    private SetNode set;
    private Node statement;
    private Scope scope;

    public ForEachNode(TupleSignatur ts, SetNode set) {
	this.tupleSignatur = ts;
	this.set = set;
    }

    @Override
    public Value eval() {
	Set<Tuple> s = set.eval();
	if (s == null) {
	    throw new RuntimeException(s + " is not a set");
	}
	// declare signature variables
	for (int i = 0; i < tupleSignatur.size(); i++) {
	scope.declare(tupleSignatur.get(i), new IntegerType());
	}
	for (Tuple t : s) {
	    // assign signature variables in foreach block
	    for (int i = 0; i < tupleSignatur.size(); i++) {
		Value v = t.get(i);
		if (v.isInteger()) {
		    scope.changeType(tupleSignatur.get(i), new IntegerType());
		} else if (v.isBoolean()) {
		    scope.changeType(tupleSignatur.get(i), new BooleanType());
		} else if (v.isSet()) {
		    scope.changeType(tupleSignatur.get(i), new SetType());
		} else if (v instanceof EnumValue) {
		    scope.changeType(tupleSignatur.get(i),
			    ((EnumValue) v).getType());
		} else {
		    throw new RuntimeException("type of variable "
			    + tupleSignatur.get(i) + " (" + v
			    + ") is not a set");
		}
		scope.assign(tupleSignatur.get(i), t.get(i));
	    }
	    // evaluate block statement
	    Value v = statement.eval();
	    if (v == Value.HALT)
		return v;
	}
	return Value.VOID;
    }

    public void addBlock(Node statement, Scope currentScope) {
	this.statement = statement;
	this.scope = currentScope;
    }

    @Override
    public String toString() {
	return String.format("(FOREACH %s IN %s DO %s)", tupleSignatur, set,
		statement);
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();
	b.append(String.format("\\Foreach{$%s$ in $%s$}", tupleSignatur, set));
	b.append("{" + statement.toLatexAlgorithmic() + "}").append("\n");
	return b.toString();
    }

}
