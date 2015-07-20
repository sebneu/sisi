package interpreter.tree.nodes;

abstract public class BinaryNode implements Node {

	protected Node left;
	protected Node right;
	
	public BinaryNode(Node l, Node r) {
		left = l;
		right = r;
	}
}