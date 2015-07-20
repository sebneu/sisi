package interpreter.tree;

import interpreter.tree.nodes.TupleNode;
import interpreter.tree.values.Tuple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TupleSet implements Set {
    private List<Tuple> tuples;

    public TupleSet() {
	tuples = new ArrayList<Tuple>();
    }

    @Override
    public boolean add(Object o) {
	if(!(o instanceof TupleNode)) {
	    throw new RuntimeException("only tuple nodes can be added to a set: " + o.getClass());
	}
	return add((TupleNode) o);
    }
    
    public boolean add(TupleNode e) {
	if (!contains(e)) {
	    return tuples.add(e.eval());
	} else {
	    return false;
	}
    }

    public void clear() {
	tuples.clear();
    }

    public boolean contains(Object o) {
	if (!(o instanceof TupleNode)) {
	    return false;
	} else {
	    return contains((TupleNode) o);
	}
    }

    public boolean contains(TupleNode t) {
	for (Tuple inList : tuples) {
	    if (t.eval().equals(inList)) {
		return true;
	    }
	}
	return false;
    }

    public boolean isEmpty() {
	return tuples.isEmpty();
    }

    @Override
    public Iterator<Tuple> iterator() {
	return tuples.iterator();
    }
    
    @Override
    public boolean remove(Object o) {
	return tuples.remove(o);
    }

    @Override
    public boolean removeAll(Collection c) {
	return tuples.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
	return tuples.retainAll(c);
    }

    @Override
    public int size() {
	return tuples.size();
    }

    @Override
    public Object[] toArray() {
	return tuples.toArray();
    }

    @Override
    public String toString() {
	return tuples.toString();
    }

    @Override
    public boolean addAll(Collection c) {
   	boolean changed = false;
   	for (Object o : c) {
   	    if(!(o instanceof TupleNode)) {
   		throw new RuntimeException("unsupported type added: " + o.getClass());
   	    }
   	    if (add((TupleNode) o)) {
   		changed = true;
   	    }
   	}
   	return changed;
       }

       @Override
       public boolean containsAll(Collection c) {
   	for (Object t : c) {
   	    if (!(t instanceof TupleNode)) {
   		return false;
   	    } else {
   		if (!tuples.contains(t)) {
   		    return false;
   		}
   	    }
   	}
   	return true;
       }


    @Override
    public Object[] toArray(Object[] a) {
	return tuples.toArray(a);
    }
}
