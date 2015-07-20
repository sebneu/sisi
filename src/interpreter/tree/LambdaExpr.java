package interpreter.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.RandInt;

import interpreter.tree.nodes.Node;
import interpreter.tree.nodes.NondetValueNode;
import interpreter.tree.types.BooleanType;
import interpreter.tree.types.IntegerType;
import interpreter.tree.types.SetType;
import interpreter.tree.values.EnumValue;
import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class LambdaExpr {
    private TupleSignatur signature;
    private Node expression;
    private Scope scope;
    private boolean trivial = false;

    public LambdaExpr(TupleSignatur signature, Node expression,
	    Scope currentScope) {
	this.expression = expression;
	this.scope = currentScope;
	this.signature = signature;
    }

    public LambdaExpr() {
	this.trivial = true;
    }

    @Override
    public String toString() {
	if (trivial) {
	    return "";
	} else {
	    return String
		    .format("(SELECT %s WHERE %s) ", signature, expression);
	}
    }

    public Tuple some(TupleSet set) {
	Set<Tuple> filter = filter(set);
	int i = 0;
	if(filter.size() <= 0) {
	    return null;
	}
	int randI = RandInt.nextInt(filter.size());
	for (Tuple t : filter) {
	    if (i == randI) {
		return t;
	    }
	    i++;
	}
	return null;
    }

    public Set<Tuple> filter(Set<Tuple> set) {
	// if there is no lambda expression this is always true
	if (trivial) {
	    return set;
	}
	// else evaluate the expression
	Set<Tuple> result = new HashSet<Tuple>();
	for (Tuple t : set) {
	    for (int i = 0; i < signature.size(); i++) {
		scope.declare(signature.get(i), t.get(i).getType());
	    }
	    if (t.size() == signature.size()) {
		for (int i = 0; i < signature.size(); i++) {
		    scope.assign(signature.get(i), t.get(i));
		}
		Value expr = expression.eval();
		if(expr == Value.VOID) {
		    throw new RuntimeException("expression has no return value");
		}
		if(expr.isBoolean()) {
		    if(expr.asBoolean()) {
			result.add(t);
		    }
		}
	    }
	    for (int i = 0; i < signature.size(); i++) {
		scope.remove(signature.get(i), t.get(i).getType());
	    }
	}
	return result;
    }

    public Value some(NondetValueNode node) {
	// if there is no lambda expression all values are possible
	if (trivial) {
	    return node.eval();
	}
	// else evaluate the expression
	List<Value> result = new ArrayList<Value>();
	for (int i = 0; i < signature.size(); i++) {
	    Value value = node.eval();
	    if (value.isInteger()) {
		scope.declare(signature.get(i), new IntegerType());
	    } else if (value.isBoolean()) {
		scope.declare(signature.get(i), new BooleanType());
	    } else if (value.isSet()) {
		scope.declare(signature.get(i), new SetType());
	    } else if (value instanceof EnumValue) {
		scope.declare(signature.get(i), ((EnumValue) value).getType());
	    } else {
		throw new RuntimeException("not supported datatype");
	    }
	    /*
	     * scope.declare(signature.get(i), value.getType());
	     */
	}

	for (Node n : node.getValues()) {
	    Value v = n.eval();
	    if (signature.size() != 1) {
		throw new RuntimeException(
			"tuples are not allowed in nondeterministic initializations");
	    }
	    scope.assign(signature.get(0), v);
	    if (expression.eval().asBoolean()) {
		result.add(v);
	    }
	}
	if (result.size() <= 0) {
	    throw new RuntimeException("no possible value for initialization");
	}
	return result.get(RandInt.nextInt(result.size()));
    }
    
    public String toLatexAlgorithmic() {
	if (trivial) {
	    return "";
	} else {
	    return String
		    .format("select %s where %s", signature.toLatexAlgorithmic(), expression.toLatexAlgorithmic());
	}
    }
}
