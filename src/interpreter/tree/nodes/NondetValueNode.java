package interpreter.tree.nodes;

import interpreter.tree.values.Value;

import java.util.ArrayList;
import java.util.List;

import util.RandInt;

public class NondetValueNode implements Node {
    private List<Node> values;
    // chosen value
    private Value value = null;

    public NondetValueNode() {
	values = new ArrayList<Node>();
    }

    public void addValue(Node node) {
	values.add(node);
    }

    public boolean isNull() {
	return values.isEmpty();
    }

    public Value choose() {
	if (value == null) {
	    int i = RandInt.nextInt(values.size());
	    value = values.get(i).eval();
	}
	return value;
    }

    public List<Node> getValues() {
	return values;
    }

    @Override
    public Value eval() {
	return choose();
    }

    @Override
    public String toString() {
	return isNull() ? "NULL" : values.toString();
    }

    @Override
    public String toLatexAlgorithmic() {
	if (isNull())
	    return "NULL";
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < values.size(); i++) {
	    sb.append(values.get(i).toString());
	    if (i < values.size() - 1) {
		sb.append(",");
	    }
	}
	return sb.toString();
    }

}
