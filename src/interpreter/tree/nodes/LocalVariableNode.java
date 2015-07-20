package interpreter.tree.nodes;

import interpreter.tree.AccessSet;
import interpreter.tree.Scope;
import interpreter.tree.TupleSignatur;
import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class LocalVariableNode implements Node {

    protected TupleSignatur signature;
    protected AccessSet rhs;
    protected Scope scope;

    public LocalVariableNode(TupleSignatur signature, AccessSet accessSet,
	    Scope s) {
	this.signature = signature;
	rhs = accessSet;
	scope = s;
    }

    @Override
    public Value eval() {
	Tuple t = rhs.eval();
	if (t == null) {
	    throw new RuntimeException(
		    "no tuple found to assign local variables " + signature);
	}
	for (int i = 0; i < signature.size(); i++) {
	    // TODO type
	    scope.declare(signature.get(i), t.get(i).getType());
	    scope.assign(signature.get(i), t.get(i));
	}
	return Value.VOID;
    }

    @Override
    public String toString() {
	return String.format("(%s = %s)", signature, rhs);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("let $%s \\leftarrow %s$\\;",
		signature.toLatexAlgorithmic(), rhs.toLatexAlgorithmic());
    }
}
