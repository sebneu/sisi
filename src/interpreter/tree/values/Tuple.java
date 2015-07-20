package interpreter.tree.values;

import interpreter.tree.ReceiveTupleSignatur;

import java.util.ArrayList;
import java.util.List;

public class Tuple implements ReturnValue {
    private List<Value> values;

    public Tuple() {
	values = new ArrayList<Value>();
    }

    public Tuple(Value value) {
	this();
	values.add(value);
    }

    public void addValue(Value eval) {
	values.add(eval);
    }

    public int size() {
	return values.size();
    }

    public Value get(int i) {
	return values.get(i);
    }

    @Override
    public boolean equals(Object o) {
	if (!(o instanceof Tuple)) {
	    return false;
	}
	return equals((Tuple) o);
    }

    public boolean equals(Tuple t) {
	if (this.size() != t.size()) {
	    return false;
	}
	for (int i = 0; i < this.size(); i++) {
	    if (!this.get(i).equals(t.get(i))) {
		return false;
	    }
	}
	return true;
    }

    public boolean hasSignatur(ReceiveTupleSignatur signatur) {
	if (values.get(0) instanceof MTypeValue) {
	    MTypeValue v = (MTypeValue) values.get(0);
	    return v.equals(signatur.get(0));
	}
	throw new RuntimeException(
		"the first value of a send tuple has to be an mtype (" + values
			+ ")");
    }

    @Override
    public String toString() {
	return values.toString();
    }

    public String toLatexAlgorithmic() {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < values.size(); i++) {
	    sb.append(values.get(i).toString());
	    if (i <= values.size() - 1) {
		sb.append(",");
	    }
	}
	return sb.toString();
    }
}
