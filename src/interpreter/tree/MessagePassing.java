package interpreter.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interpreter.tree.values.Tuple;

public class MessagePassing {
    private List<ArrayList<Message>> processQueues;
    private int numberOfProcesses;

    public MessagePassing(int numberOfProcesses) {
	this.numberOfProcesses = numberOfProcesses;
	processQueues = new ArrayList<ArrayList<Message>>();
	for (int i = 0; i < numberOfProcesses; i++) {
	    processQueues.add(new ArrayList<Message>());
	}
    }

    public void sendTo(Tuple eval, int p, int sender) {
	if (p >= numberOfProcesses || p < 0) {
	    throw new RuntimeException("illegal process id");
	}
	processQueues.get(p).add(new Message(eval, sender));
    }

    public void sendToAll(Tuple tuple, int sender) {
	for (ArrayList<Message> queue : processQueues) {
	    queue.add(new Message(tuple, sender));
	}
    }

    public Message receive(int processId, ReceiveTupleSignatur signatur) {
	ArrayList<Message> messages = processQueues.get(processId);
	for (int i = 0; i < messages.size(); i++) {
	    Message m = messages.get(i);
	    if (m.hasSignatur(signatur)) {
		messages.remove(i);
		return m;
	    }
	}
	return null;
    }

    public Message receiveFromDistinctProcesses(int distinctProcesses,
	    int processId, ReceiveTupleSignatur signatur) {
	if(distinctProcesses <= 0) {
	    throw new RuntimeException("the number of processes has to be a positive integer");
	}
	ArrayList<Message> messages = processQueues.get(processId);
	Map<Integer, Tuple> count = new HashMap<Integer, Tuple>();
	ArrayList<Message> remove = new ArrayList<Message>();
	for (int i = 0; i < messages.size(); i++) {
	    Message m = messages.get(i);
	    if (m.hasSignatur(signatur)) {
		count.put(m.getSender(), m.getTuple());
		remove.add(m);
	    }
	}
	if(count.size() >= distinctProcesses) {
	    messages.removeAll(remove);
	    return remove.get(0);
	}
	return null;
    }
}
