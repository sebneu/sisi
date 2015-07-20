package interpreter.tree.values;

import interpreter.tree.TupleSet;
import interpreter.tree.types.Type;

public class EnumValue extends Value {
    private Type type;
    private String identifier;

    public EnumValue(Type t, String id, int i) {
	identifier = id;
	type = t;
	value = new Integer(i);
    }

    @Override
    public int compareTo(Value v) {
	if (v instanceof EnumValue || v.isInteger()) {
	    return asInteger() - v.asInteger();
	} else {
	    throw new RuntimeException("value " + v + " is not comparable to "
		    + toString());
	}
    }
    
    @Override
    public boolean equals(Object o) {
	if (o instanceof EnumValue) {
	    return equals((EnumValue) o);
	} else {
	    return false;
	}
    }
    
    public boolean equals(EnumValue o) {
	return o.asInteger().equals(this.asInteger());
    }

    @Override
    public Boolean asBoolean() {
	throw new RuntimeException("enum value");
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
	throw new RuntimeException("enum value");
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
