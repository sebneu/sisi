package interpreter.tree;

import interpreter.tree.values.Tuple;

import java.util.Set;

public interface SetNode {
    public Set<Tuple> eval();
}
