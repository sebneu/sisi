package interpreter.tree.nodes;

import interpreter.tree.FilterSet;

public interface BoolExpressionOnSetNode extends Node {

    void set(String string);

    void set(FilterSet filterSet);
}
