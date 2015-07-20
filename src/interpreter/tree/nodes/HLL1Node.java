package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class HLL1Node implements Node {
    private Node decl;
    private Node init;
    private Node receive;
    private Node step;
    private MTypeDeclarationNode mtypes;

    public HLL1Node(Node decl, Node init, Node receive, Node step) {
	this.decl = decl;
	this.init = init;
	this.receive = receive;
	this.step = step;
    }

    @Override
    public String toString() {
	if (receive != null) {
	    return decl.toString() + init.toString() + receive.toString()
		    + step.toString();
	} else {
	    return decl.toString() + init.toString() + step.toString();
	}
    }


    public void declaration() {
	// add declarations
	decl.eval();
	// assign values to mtypes
	this.mtypes.eval();
    }
    
    @Override
    public Value eval() {
	// do initialization
	init.eval();

	return Value.VOID;
    }

    public Value step() {
	// first evaluate receive block
	if (receive != null) {
	    Value r = receive.eval();
	    if (r == Value.HALT) {
		return r;
	    }
	}
	// then do a step
	return step.eval();
    }

    public void mtypes(MTypeDeclarationNode mtypes) {
	this.mtypes = mtypes;
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder sb = new StringBuilder();
	sb.append("\\begin{algorithm}[H]\n");
	sb.append("\\dontprintsemicolon\n");
	sb.append(decl.toLatexAlgorithmic());
	sb.append(init.toLatexAlgorithmic());
	if (receive != null) {
	    sb.append(receive.toLatexAlgorithmic());
	}
	sb.append(step.toLatexAlgorithmic());
	sb.append("\\end{algorithm}\n");
	return sb.toString();
    }
}
