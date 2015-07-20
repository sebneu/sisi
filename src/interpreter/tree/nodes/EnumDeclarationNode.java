package interpreter.tree.nodes;

import java.util.HashSet;
import java.util.Set;

import interpreter.tree.Enums;
import interpreter.tree.Scope;
import interpreter.tree.types.EnumEntryType;
import interpreter.tree.types.Type;
import interpreter.tree.values.EnumValue;
import interpreter.tree.values.Value;

public class EnumDeclarationNode implements Node {

    private String typeId;
    private Set<String> elements;
    private Enums enums;
    private Scope scope;

    public EnumDeclarationNode(Scope currentScope, Enums enums) {
	this.scope = currentScope;
	this.enums = enums;
	this.elements = new HashSet<String>();
    }

    public void addElement(String string) {
	if (!elements.add(string)) {
	    throw new RuntimeException(
		    "enum cannot contain multiple equal entries");
	}

    }

    public void addTypeId(String typeId) {
	this.typeId = typeId;
	this.enums.declareEnum(this);
    }

    @Override
    public Value eval() {
	// assign int values to enum entries
	int i = 0;
	for(String v: elements) {
	    Type t = new EnumEntryType(typeId, enums);
	    scope.declare(v, t);
	    scope.assign(v, new EnumValue(t, v, i));
	    i++;
	}
	return Value.VOID;
    }

    @Override
    public boolean equals(Object n) {
	if (!(n instanceof EnumDeclarationNode)) {
	    return false;
	} else {
	    return equals((EnumDeclarationNode) n);
	}
    }

    public boolean equals(EnumDeclarationNode n) {
	return n.typeId.equals(this.typeId);
    }

    public String getIdentifier() {
	return typeId;
    }

    public String toString() {
	return String.format("(ENUM %s %s)", typeId, elements);
    }

    @Override
    public String toLatexAlgorithmic() {
	return String.format("enum %s %s\\;", typeId, elements);
    }
}
