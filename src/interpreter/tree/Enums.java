package interpreter.tree;

import interpreter.tree.nodes.EnumDeclarationNode;

import java.util.ArrayList;
import java.util.List;

public class Enums {
    private List<EnumDeclarationNode> enumDeclarations;

    public Enums() {
	this.enumDeclarations = new ArrayList<EnumDeclarationNode>();
    }

    public void declareEnum(EnumDeclarationNode enumDeclarationNode) {
	if (enumDeclarations.contains(enumDeclarationNode)) {
	    throw new RuntimeException("enum " + enumDeclarationNode.getIdentifier()
		    + " is already declared");
	} else {
	    this.enumDeclarations.add(enumDeclarationNode);
	}
    }

    public boolean isDeclared(String typeId) {
	for(EnumDeclarationNode n: enumDeclarations) {
	    if(n.getIdentifier().equals(typeId)) {
		return true;
	    }
	}
	return false;
    }
}
