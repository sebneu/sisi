package interpreter.tree;

import java.util.ArrayList;
import java.util.List;

public class TupleSignatur {
    protected List<String> identifier;

    public TupleSignatur() {
	identifier = new ArrayList<String>();
    }

    public void addIdentifier(String id) {
	identifier.add(id);
    }

    public int size() {
	return identifier.size();
    }

    @Override
    public String toString() {
	return identifier.toString();
    }

    public String get(int i) {
	return identifier.get(i);
    }

    public Object toLatexAlgorithmic() {
	StringBuilder b = new StringBuilder();
	if (identifier.size() > 1) {
	    b.append("(");
	}
	for (int i = 0; i < identifier.size(); i++) {
	    b.append(identifier.get(i));
	    if (i < identifier.size() - 1) {
		b.append(", ");
	    }
	}
	if (identifier.size() > 1) {
	    b.append(")");
	}
	return b.toString();
    }

}
