package interpreter;

import interpreter.tree.Enums;
import interpreter.tree.MessagePassing;
import interpreter.tree.Scope;
import interpreter.tree.nodes.HLL1Node;
import interpreter.tree.values.Value;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import ui.UserInterface;
import util.RandInt;

import exceptions.InputFileException;

public class HLL1Interpreter {
    private ANTLRInputStream inputStream;
    private String outputPath;
    private int rounds;
    private HLL1Node output;
    private Scope scope;
    private UserInterface ui;
    private StringBuilder result;
    private int numberOfProcesses;
    private CommonTreeNodeStream nodes;
    private Interpreter_HLL1 interpreter;

    public HLL1Interpreter(UserInterface ui) {
	this.ui = ui;
	this.result = new StringBuilder();
    }

    public void setInput(File input) throws InputFileException,
	    FileNotFoundException, IOException {
	if (input == null) {
	    throw new InputFileException("Input file not set.");
	}
	if (!input.canRead()) {
	    throw new InputFileException("No reading rights on the input file.");
	}
	if (!input.isFile()) {
	    throw new InputFileException("Specified input is no file.");
	}
	this.inputStream = new ANTLRInputStream(new FileInputStream(input));
    }

    public void setOutput(String outputPath) {
	this.outputPath = outputPath;
    }

    public void setNumberOfRounds(int rounds) {
	this.rounds = rounds;
    }

    public void setNumberOfProcesses(int numberOfProcesses) {
	this.numberOfProcesses = numberOfProcesses;
    }

    public String parse() throws RecognitionException {
	ui.debugMessage("create lexer");
	HLL1Lexer lexer = new HLL1Lexer(inputStream);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	ui.debugMessage("create parser");
	HLL1Parser parser = new HLL1Parser(tokens);
	HLL1Parser.algorithm_return r = parser.algorithm();

	// walk resulting tree
	CommonTree tree = r.getTree();
	nodes = new CommonTreeNodeStream(tree);
	nodes.setTokenStream(tokens);
	scope = new Scope();
	interpreter = new Interpreter_HLL1(nodes, scope, new Enums(), null, -1, -1);
	output = interpreter.algorithm();
	ui.debugMessage("add parser result to output file");
	result.append(output.toString());
	// reset nodes
	nodes.reset();
	return output.toString();
    }

    public void startSimulation() throws RecognitionException {
	// create n processes with n scopes
	List<Simulation> processes = new ArrayList<Simulation>(
		numberOfProcesses);
	// message passing interface;
	MessagePassing messagePassing = new MessagePassing(numberOfProcesses);

	// initialize scope with initial values
	for (int i = 0; i < numberOfProcesses; i++) {
	    // add new process simulation
	    Simulation p = new Simulation(i, nodes, messagePassing, numberOfProcesses);
	    // evaluate init
	    result.append(ui.infoMessage("Initial Values of Process " + i));
	    p.init();
	    result.append(ui.infoMessage(p.toString()));
	    // add simulation of actual process
	    processes.add(p);
	}

	// number of steps
	for (int i = 1; i <= rounds; i++) {
	    // choose random process for this round
	    if (numberOfProcesses == 0) {
		return;
	    }
	    int p = RandInt.nextInt(numberOfProcesses);

	    Simulation process = processes.get(p);

	    // evaluate step block
	    Value v = process.step();

	    // resulting declared variables after current round
	    result.append(ui.debugMessage("Round " + i + ", Process "
		    + process.getId()));
	    result.append(ui.debugMessage(process.toString()));
	    if (v == Value.HALT) {
		result.append(ui.debugMessage("HALT"));
		result.append(ui.infoMessage("Resulting Values of Process "
			+ process.getId() + " in Round " + i + " (halt)"));
		result.append(ui.infoMessage(process.toString()));
		processes.remove(process);
		numberOfProcesses--;
	    }
	}

	// append not finished processes
	for (Simulation p : processes) {
	    result.append(ui.infoMessage("Resulting Values of Process "
		    + p.getId()));
	    result.append(ui.infoMessage(p.toString()));
	}
    }

    public void writeFile() throws IOException {
	FileWriter out = new FileWriter(this.outputPath);
	out.write(result.toString());
	out.close();
    }

    public void latexOutput(String latexFile) throws RecognitionException,
	    IOException {
	ui.debugMessage("create lexer");
	HLL1Lexer lexer = new HLL1Lexer(inputStream);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	ui.debugMessage("create parser");
	HLL1Parser parser = new HLL1Parser(tokens);
	HLL1Parser.algorithm_return r = parser.algorithm();
	// walk resulting tree
	ui.debugMessage("walk resulting tree");
	CommonTree tree = r.getTree();
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
	nodes.setTokenStream(tokens);
	scope = new Scope();
	Interpreter_HLL1 interpreter = new Interpreter_HLL1(nodes, scope,
		new Enums(), null, -1, -1);
	output = interpreter.algorithm();
	ui.debugMessage("algorithm parsed:");
	ui.debugMessage(output.toString());
	FileWriter out = new FileWriter(latexFile);
	String result = output.toLatexAlgorithmic();
	ui.debugMessage("latex output:");
	ui.debugMessage(result);
	ui.debugMessage("write to file " + latexFile);
	out.write(result);
	out.close();
    }
}
