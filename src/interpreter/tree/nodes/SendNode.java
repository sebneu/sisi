package interpreter.tree.nodes;

import interpreter.tree.MessagePassing;
import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class SendNode implements Node {
    private SendTupleNode t;
    private Node r;
    private MessagePassing messages;
    private int processId;

    public SendNode(MessagePassing messages, int processId) {
	this.messages = messages;
	this.processId = processId;
    }

    @Override
    public Value eval() {
	Tuple tuple = t.eval();
	Value receiver;
	if (r == null) {
	    receiver = Value.ALL;
	    messages.sendToAll(tuple, processId);
	} else {
	    receiver = r.eval();
	    if (!receiver.isInteger()) {
		throw new RuntimeException(
			"the receiver has to be an integer value or ALL");
	    }
	    messages.sendTo(t.eval(), receiver.asInteger(), processId);
	}
	
	return Value.VOID;
    }

    public void sendToAll(SendTupleNode t) {
	sendTo(t, null);
    }

    public void sendTo(SendTupleNode t, Node receiver) {
	if (t.size() <= 0) {
	    throw new RuntimeException("no mtype in receive statement " + this
		    + " defined");
	}
	this.t = t;
	this.r = receiver;
    }

    @Override
    public String toString() {
	if (r == null) {
	    return String.format("(SEND %s TO ALL)", t);
	} else {
	    return String.format("(SEND %s TO %s)", t, r);
	}
    }

    @Override
    public String toLatexAlgorithmic() {
	if (r == null) {
	    return String.format("send %s to $all$\\;",
		    t.toLatexAlgorithmic());
	} else {
	    return String.format("send %s to $%s$\\;",
		    t.toLatexAlgorithmic(), r.toLatexAlgorithmic());
	}
    }
}
