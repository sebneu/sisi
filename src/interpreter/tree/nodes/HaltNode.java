package interpreter.tree.nodes;

import interpreter.tree.values.Value;

public class HaltNode implements Node {
    @Override
    public Value eval() {
	return Value.HALT;
    }

    @Override
    public String toString() {
	return "(HALT)";
    }

    @Override
    public String toLatexAlgorithmic() {
	return "$HALT$";
    }
}
