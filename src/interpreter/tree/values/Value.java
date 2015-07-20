package interpreter.tree.values;

import interpreter.tree.TupleSet;
import interpreter.tree.types.BooleanType;
import interpreter.tree.types.IntegerType;
import interpreter.tree.types.SetType;
import interpreter.tree.types.Type;

import java.util.Set;

public class Value implements ReturnValue, Comparable<Value> {
    public static final Value NULL = new Value();
    public static final Value VOID = new Value();
    public static final Value HALT = new Value();
    public static final Value ALL = new Value();

    protected Object value;

    protected Value() {
	// private constructor: only used for NULL and VOID
	value = new Object();
    }

    public Value(Object v) {
	if (v == null) {
	    throw new RuntimeException("v == null");
	}
	value = v;
	// only accept boolean, number or string types
	if (!(isBoolean() || isInteger() || isSet())) {
	    throw new RuntimeException("invalid data type: " + v + " ("
		    + v.getClass() + ")");
	}
    }

    public Boolean asBoolean() {
	return (Boolean) value;
    }

    public Integer asInteger() {
	return (Integer) value;
    }

    public TupleSet asSet() {
	return (TupleSet) value;
    }

    @Override
    public int compareTo(Value that) {
	if (this.isInteger() && that.isInteger()) {
	    if (this.equals(that)) {
		return 0;
	    } else {
		return this.asInteger().compareTo(that.asInteger());
	    }
	} else {
	    throw new RuntimeException("illegal expression: can't compare `"
		    + this + "` to `" + that + "`");
	}
    }

    @Override
    public boolean equals(Object o) {
	if (this == VOID || o == VOID) {
	    throw new RuntimeException("can't use VOID: " + this + " ==/!= "
		    + o);
	}
	if (this == o) {
	    return true;
	}
	if (o == null || this.getClass() != o.getClass()) {
	    return false;
	}
	Value that = (Value) o;
	if (this.isInteger() && that.isInteger()) {
	    return this.asInteger() == that.asInteger();
	} else {
	    return this.value.equals(that.value);
	}
    }

    @Override
    public int hashCode() {
	return value.hashCode();
    }

    public boolean isBoolean() {
	return value instanceof Boolean;
    }

    public boolean isInteger() {
	return value instanceof Number;
    }

    public boolean isSet() {
	return value instanceof Set;
    }

    public boolean isNull() {
	return this == NULL;
    }

    public boolean isVoid() {
	return this == VOID;
    }

    @Override
    public String toString() {
	return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
    }

    public boolean hasType(Type type) {
	return (this.isBoolean() && type.isBoolean())
		|| (this.isInteger() && type.isInteger())
		|| (this.isSet() && type.isSet());
    }

    public Type getType() {
	if(isBoolean()) {
	    return new BooleanType();
	}
	if(isInteger()) {
	    return new IntegerType();
	}
	if(isSet()) {
	    return new SetType();
	}
	throw new RuntimeException("type of " + this + " is not supported for local variables");
    }
}
