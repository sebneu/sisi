package interpreter.tree.nodes;

import interpreter.tree.values.Value;


public interface Node {
	Value eval();
	String toString();
	String toLatexAlgorithmic();
}