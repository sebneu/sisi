package interpreter.tree.nodes;

import interpreter.tree.Message;
import interpreter.tree.MessagePassing;
import interpreter.tree.ReceiveTupleSignatur;
import interpreter.tree.Scope;
import interpreter.tree.types.BooleanType;
import interpreter.tree.types.IntegerType;
import interpreter.tree.types.SetType;
import interpreter.tree.values.EnumValue;
import interpreter.tree.values.Tuple;
import interpreter.tree.values.Value;

public class ReceiveFromAnyNode implements ReceiveNode {

    private Scope scope;
    private ReceiveTupleSignatur signatur;
    private Node statement;
    private String sender;
    private MessagePassing messages;
    private int processId;

    public ReceiveFromAnyNode(String id, MessagePassing messages,
	    int processId, Scope currentScope) {
	this.sender = id;
	this.messages = messages;
	this.processId = processId;
	this.scope = currentScope;
    }

    @Override
    public Value eval() {
	Message m = messages.receive(processId, signatur);
	if(m == null) {
	    return Value.VOID;	    
	}
	Tuple t = m.getTuple();
	if(t.size() != signatur.size()) {
	    throw new RuntimeException("signature " + signatur + " is not of the same length as the received tuple " + t);
	}
	if (t.size() > 1) {
	    for (int i = 1; i < t.size(); i++) {
		Value v = t.get(i);
		if (v.isBoolean()) {
		    scope.declare(signatur.get(i), new BooleanType());
		    scope.assign(signatur.get(i), v);
		} else if (v.isInteger()) {
		    scope.declare(signatur.get(i), new IntegerType());
		    scope.assign(signatur.get(i), v);
		} else if (v.isSet()) {
		    scope.declare(signatur.get(i), new SetType());
		    scope.assign(signatur.get(i), v);
		} else if(v instanceof EnumValue) {
		    EnumValue e = (EnumValue) v;
		    scope.declare(signatur.get(i), e.getType());
		    scope.assign(signatur.get(i), e);
		} else {
		    throw new RuntimeException("variable " + signatur.get(i)
			    + " has unsupported type " + v);
		}
	    }
	}
	scope.declare(sender, new IntegerType());
	scope.assign(sender, new Value(m.getSender()));
	Value s = statement.eval();
	return s;
    }

    public void initialize(ReceiveTupleSignatur a, Node statement,
	    MTypeDeclarationNode mtypes) {
	if (a.size() <= 0) {
	    throw new RuntimeException("no mtype in receive statement " + this
		    + " defined");
	}
	mtypes.addMType(a.get(0));
	this.signatur = a;
	this.statement = statement;
    }

    @Override
    public String toString() {
	return String.format("(ON RECEIVE %s FROM %s DO %s)", signatur, sender,
		statement);
    }

    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();
	b.append(String.format("on receive %s from $%s$:\\;\n",
		signatur.toLatexAlgorithmic(), sender));
	if (statement != null) {
	    b.append("\\Indp\n");
	    b.append(statement.toLatexAlgorithmic());
	    b.append("\\Indm\n");
	}
	return b.toString();
    }
}
