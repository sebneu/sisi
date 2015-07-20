package interpreter.tree.nodes;

public class SendTupleNode extends TupleNode {

    public void addMType(MTypeNode mtype) {
	super.tupleObjects.add(mtype);
    }
    
}
