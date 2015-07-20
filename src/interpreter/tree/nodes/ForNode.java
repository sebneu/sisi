package interpreter.tree.nodes;

import interpreter.tree.Scope;
import interpreter.tree.types.IntegerType;
import interpreter.tree.values.Value;

public class ForNode implements Node {
    private String identifier;
    private Node startExpr;
    private Node updateExpr;
    private Node stopExpr;
    private Node block;
    protected Scope scope;

    public ForNode(String id) {
	this.identifier = id;
    }

    public ForNode(String id, Node start) {
	this(id);
	this.startExpr = start;
    }

    public void addStopExpr(Node stop) {
	this.stopExpr = stop;
    }

    public void addUpdateExpr(Node update) {
	this.updateExpr = update;
    }

    public void addBlock(Node block, Scope s) {
	this.block = block;
	this.scope = s;
    }

    @Override
    public Value eval() {
	if (updateExpr != null) {
	    throw new RuntimeException(
		    "update expression for for-loop is not implemented.");
	}

	// inner scope for a counter variable
	int start;
	if (startExpr == null) {
	    start = new IdentifierNode(identifier, scope).eval().asInteger();
	} else {
	    if (scope.resolve(identifier) == null) {
		scope.declare(identifier, new IntegerType());
	    }
	    start = startExpr.eval().asInteger();
	}
	int stop = stopExpr.eval().asInteger();

	for (int i = start; i <= stop; i++) {
	    scope.assign(identifier, new Value(i));
	    Value returnValue = block.eval();
	    if (returnValue == Value.HALT) {
		return returnValue;
	    }
	}

	return Value.VOID;
    }

    @Override
    public String toString() {
	String result = "";
	if (startExpr == null) {
	    result += String.format("FOR (%s .. %s)", identifier, stopExpr);
	} else {
	    result += String.format("FOR ((%s = %s) .. %s)", identifier,
		    startExpr, stopExpr);
	}
	if (updateExpr != null) {
	    result += " WITH " + updateExpr;
	}
	return result + " DO " + block;
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();
	if (startExpr == null) {
	    b.append(
		    String.format("\\For{$%s$ to $%s$}", identifier,
			    stopExpr.toLatexAlgorithmic()));
	} else {
	    b.append(
		    String.format("\\For{$%s \\leftarrow %s$ to $%s$}", identifier,
			    startExpr.toLatexAlgorithmic(),
			    stopExpr.toLatexAlgorithmic()));
	}
	b.append("\n");
	b.append("{" + block.toLatexAlgorithmic() + "}");
	return b.toString();
    }
}