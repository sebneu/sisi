package interpreter.tree.values;

import interpreter.tree.TupleSet;
import interpreter.tree.types.Type;

public class MTypeValue extends Value {
    private Type type;
    private String identifier;

    public MTypeValue(Type t, String id, int i) {
	identifier = id;
	type = t;
	value = new Integer(i);
    }

    @Override
    public int compareTo(Value v) {
	if (v instanceof MTypeValue || v.isInteger()) {
	    return asInteger() - v.asInteger();
	} else {
	    throw new RuntimeException("value " + v + " is not comparable to "
		    + toString());
	}
    }

    @Override
    public boolean equals(Object o) {
	if (o instanceof MTypeValue) {
	    return equals((MTypeValue) o);
	} else {
	    return false;
	}
    }

    public boolean equals(MTypeValue o) {
	return o.asInteger() == this.asInteger();
    }
    


    public boolean equals(String s) {
	return s.equals(this.identifier);
    }

    @Override
    public Boolean asBoolean() {
	throw new RuntimeException("mtype value");
    }

    @Override
    public Integer asInteger() {
	return (Integer) value;
    }

    @Override
    public boolean isBoolean() {
	return false;
    }

    @Override
    public boolean isInteger() {
	return false;
    }

    @Override
    public boolean isSet() {
	return false;
    }

    @Override
    public boolean isNull() {
	return false;
    }

    @Override
    public boolean hasType(Type type) {
	return this.type.equals(type);
    }

    @Override
    public TupleSet asSet() {
	throw new RuntimeException("mtype value");
    }

    @Override
    public String toString() {
	return type + "." + identifier;
    }

    @Override
    public Type getType() {
	return type;
    }

}
