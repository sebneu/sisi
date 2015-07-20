package interpreter.tree;

import interpreter.tree.values.Tuple;

public class Message {
    private Tuple tuple;
    private int sender;
    
    public Message(Tuple eval, int sender) {
	this.tuple = eval;
	this.sender = sender;
    }
    public Tuple getTuple() {
	return tuple;
    }
    public void setTuple(Tuple tuple) {
	this.tuple = tuple;
    }
    public int getSender() {
	return sender;
    }
    public void setSender(int sender) {
	this.sender = sender;
    }
    public boolean hasSignatur(ReceiveTupleSignatur signatur) {
	return getTuple().hasSignatur(signatur);
    }
}
