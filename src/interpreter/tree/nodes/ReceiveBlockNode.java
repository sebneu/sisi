package interpreter.tree.nodes;

import java.util.ArrayList;
import java.util.List;

import interpreter.tree.values.Value;

public class ReceiveBlockNode implements Node {
    private List<Node> receiveNodes;
    
    public ReceiveBlockNode() {
	receiveNodes = new ArrayList<Node>();
    }

    @Override
    public Value eval() {
	for(Node n: receiveNodes) {
	    Value v = n.eval();
	    if(v == Value.HALT) {
		return v;
	    }
	}
	return Value.VOID;
    }

    public void addReceiveNode(Node n) {
	receiveNodes.add(n);
    }
    
    @Override
    public String toString() {
	StringBuilder b = new StringBuilder();
	b.append("RECEIVE\n");
	for (Node receive : receiveNodes) {
	    b.append(receive).append("\n");
	}
	return b.toString() + "\n";
    }
    
    @Override
    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();

	b.append("\\FuncSty{\\bf{Receive}}\\;\n");
	for (Node receive : receiveNodes) {
	    b.append(receive.toLatexAlgorithmic()).append("\n");
	}
	return b.toString();
    }

}
