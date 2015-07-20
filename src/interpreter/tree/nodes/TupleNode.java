package interpreter.tree.nodes;

import interpreter.tree.nodes.Node;
import interpreter.tree.values.Tuple;

import java.util.ArrayList;
import java.util.List;

public class TupleNode {
    protected List<Node> tupleObjects;

    public TupleNode() {
	tupleObjects = new ArrayList<Node>();
    }

    public TupleNode(Node tupleObject) {
	this();
	tupleObjects.add(tupleObject);
    }

    public void addTupleObject(Node tupleObject) {
	tupleObjects.add(tupleObject);
    }

    public int size() {
	return tupleObjects.size();
    }

    public Node get(int i) {
	return tupleObjects.get(i);
    }

    public Tuple eval() {
	Tuple t = new Tuple();
	for (Node n : tupleObjects) {
	    t.addValue(n.eval());
	}
	return t;
    }

    @Override
    public String toString() {
	return tupleObjects.toString();
    }

    public String toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();
	if (tupleObjects.size() > 1) {
	    b.append("(");
	}
	for (int i = 0; i < tupleObjects.size(); i++) {
	    b.append(tupleObjects.get(i));
	    if (i < tupleObjects.size() - 1) {
		b.append(", ");
	    }
	}
	if (tupleObjects.size() > 1) {
	    b.append(")");
	}
	return b.toString();
    }
}
