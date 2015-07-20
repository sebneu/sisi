package interpreter;

import interpreter.tree.Enums;
import interpreter.tree.MessagePassing;
import interpreter.tree.Scope;
import interpreter.tree.nodes.HLL1Node;
import interpreter.tree.values.Value;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Simulation {

    private Scope scope;
    private Interpreter_HLL1 interpreter;
    private HLL1Node output;
    private CommonTreeNodeStream nodes;
    private int id;
    private MessagePassing messagePassing;
    private int numberOfProcesses;

    public Simulation(int id, CommonTreeNodeStream nodes, MessagePassing messagePassing, int numberOfProcesses) throws RecognitionException {
	this.id = id;
	this.messagePassing = messagePassing;
	this.nodes = nodes;
	this.numberOfProcesses = numberOfProcesses;
	scope = new Scope();
	interpreter = new Interpreter_HLL1(nodes, scope, new Enums(), messagePassing, id, numberOfProcesses);
	output = interpreter.algorithm();
    }
    
    public int getId() {
	return id;
    }

    public void init() {
	output.declaration();
	output.eval();
	// reset nodes for next init
	nodes.reset();
    }

    public Value step() throws RecognitionException {
	Value v = output.step();
	// reset nodes for next step
	nodes.reset();
	interpreter = new Interpreter_HLL1(nodes, scope, new Enums(), messagePassing, id, numberOfProcesses);
	output = interpreter.algorithm();
	return v;

    }

    @Override
    public String toString() {
	return scope.toString();
    }

}
