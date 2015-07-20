package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class AtomNode implements Node {

    private Value value;

    public AtomNode(Object v) {
	value = (v == null) ? Value.NULL : new Value(v);
    }

    @Override
    public Value eval() {
	return value;
    }

    @Override
    public String toString() {
	return value.toString();
    }

    @Override
    public String toLatexAlgorithmic() {
	return value.toString();
    }
}
