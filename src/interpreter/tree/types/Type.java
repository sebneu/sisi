package interpreter.tree.types;

import interpreter.tree.Enums;

public class Type {

    public static final Type INTEGER = new Type();
    public static final Type BOOLEAN = new Type();
    public static final Type SET = new Type();
    public static final Type MTYPE = new Type();

    private Type type;
    private String enumName = null;

    private Type() {
	type = null;
    }

    public Type(String typeId) {
	if (typeId.equals("boolean")) {
	    type = BOOLEAN;
	} else if (typeId.equals("int")) {
	    type = INTEGER;
	} else if (typeId.equals("Set")) {
	    type = SET;
	} else if (typeId.equals("mtype")) {
	    type = MTYPE;
	} else {
	    throw new RuntimeException("type " + typeId + " not supported");
	}
    }
    
    public Type(Type type) {
	this.type = type;
    }

    public Type(String typeId, Enums enums) {
	if(!enums.isDeclared(typeId)) {
	    throw new RuntimeException("no enum or type " + typeId + " declared");
	}
	enumName = typeId;
	type = this;
    }

    public Type getType() {
	return type;
    }

    public boolean isEnum() {
	return enumName != null;
    }

    public boolean isBoolean() {
	return type == BOOLEAN;
    }

    public boolean isInteger() {
	return type == INTEGER;
    }

    public boolean isSet() {
	return type == SET;
    }
    
    @Override
    public boolean equals(Object o) {
	if (o instanceof Type) {
	    return equals((Type) o);
	} else {
	    throw new RuntimeException("type " + o + " is not comparable to "
		    + toString());
	}
    }
    
    public boolean equals(Type o) {
	return o.toString().equals(this.toString());
    }
    @Override
    public String toString() {
	if (type == INTEGER) {
	    return "INT";
	} else if (type == BOOLEAN) {
	    return "BOOL";
	} else if (type == SET) {
	    return "SET";
	} else if (type == MTYPE) {
	    return "MTYPE";
	} else {
	    return enumName;
	}
    }
}
