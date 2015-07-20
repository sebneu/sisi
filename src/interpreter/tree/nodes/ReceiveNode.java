package interpreter.tree.nodes;

import interpreter.tree.ReceiveTupleSignatur;

public interface ReceiveNode extends Node {
    public void initialize(ReceiveTupleSignatur signatur, Node statement,
	    MTypeDeclarationNode mtypes);
}
