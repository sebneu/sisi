package interpreter;

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.RecognitionException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import exceptions.InputFileException;

import ui.Console;
import ui.UserInterface;
import util.Filename;

public class SimpleInterpreter {
    private static final String VERSION = "1.0";
    private static final String LANGUAGE_NAME = "simple";
    private static final String RUN_COMMAND = "SimpleInterpreter";

    private UserInterface ui = new Console();
    private HLL1Interpreter interpreter;
    private File input;
    private String inputPath;
    private int numberOfRounds;
    private String outputPath;
    private int numberOfProcesses;
    private boolean simulate;

    public SimpleInterpreter(String[] args) {
	// create interpreter
	interpreter = new HLL1Interpreter(ui);

	// create Options object
	Options options = new Options();
	// add t option
	Option help = new Option("h", "help", false, "print this message");
	Option version = new Option("v", "version", false,
		"print the version information and exit");
	Option inputFile = new Option("f", "file", true,
		"specify the input file of the interpreter");
	Option outputFile = new Option("o", "output", true,
		"specify the output file of the interpreter");
	Option rounds = new Option("r", "rounds", true,
		"specify the number of rounds");
	Option processes = new Option("p", "processes", true,
		"specify the number of processes");
	Option debug = new Option("d", "debug", false, "print debug messages");
	Option latex = new Option("l", "latexOutput", true,
		"translate the algorithm to latex, using the algorithm2e package");
	Option parseOnly = new Option("parseOnly",
		"parse the algorithm without simulation");

	options.addOption(help);
	options.addOption(version);
	options.addOption(inputFile);
	options.addOption(outputFile);
	options.addOption(rounds);
	options.addOption(processes);
	options.addOption(debug);
	options.addOption(latex);
	options.addOption(parseOnly);

	// create the CommandLineParser
	CommandLineParser parser = new GnuParser();
	CommandLine line;
	try {
	    // parse the command line arguments
	    line = parser.parse(options, args);
	} catch (ParseException exp) {
	    // oops, something went wrong
	    ui.errorMessage("Parsing failed.  Reason: " + exp.getMessage());
	    return;
	}

	// help option
	if (line.hasOption(help.getOpt())) {
	    printHelpStatement(options);
	    return;
	}

	// version info
	if (line.hasOption(version.getOpt())) {
	    System.out.println("Version Info:");
	    System.out.println(LANGUAGE_NAME + " interpreter version "
		    + VERSION);
	    return;
	}

	// input file
	if (line.hasOption(inputFile.getOpt())) {
	    inputPath = line.getOptionValue(inputFile.getOpt());
	    input = new File(inputPath);
	    if (!input.exists()) {
		ui.errorMessage("input file not found");
		return;
	    }
	} else {
	    ui.errorMessage("no input file specified");
	    printHelpStatement(options);
	    return;
	}
	ui.infoMessage("input file: " + inputPath);
	try {
	    interpreter.setInput(input);
	} catch (IOException e) {
	    ui.error(e);
	    return;
	} catch (InputFileException e) {
	    ui.error(e);
	    return;
	}

	// debug messages
	ui.enableDebugMessages(line.hasOption(debug.getOpt()));
	ui.debugMessage("debug messages enabled");

	// latex output
	if (line.hasOption(latex.getOpt())) {
	    ui.infoMessage("create ONLY latex output for given input");
	    ui.infoMessage("use algorithm2e latex package");
	    String latexFile = line.getOptionValue(outputFile.getOpt());
	    ui.infoMessage("latex output file: " + latexFile);
	    try {
		interpreter.latexOutput(latexFile);
	    } catch (RecognitionException e) {
		ui.error(e);
		return;
	    } catch (IOException e) {
		ui.error(e);
		return;
	    }
	    ui.infoMessage("process finished");
	    return;
	}

	// output file
	if (line.hasOption(outputFile.getOpt())) {
	    outputPath = line.getOptionValue(outputFile.getOpt());
	    // boolean exists = true;
	    // int count = 0;
	    // while (exists) {
	    // if (new File(outputPath).exists()) {
	    // count++;
	    // outputPath = Filename.filename(outputPath) + count
	    // + Filename.extension(outputPath);
	    // } else {
	    // exists = false;
	    // }
	    // }
	} else {
	    outputPath = Filename.filename(inputPath) + "_out";
	    String extension = Filename.extension(inputPath);
	    if(!extension.isEmpty()) {
		outputPath += "." + extension;
	    }
	}
	ui.infoMessage("output file: " + outputPath);
	interpreter.setOutput(outputPath);

	// rounds
	if (line.hasOption(rounds.getOpt())) {
	    try {
		numberOfRounds = Integer.parseInt(line.getOptionValue(rounds
			.getOpt()));
	    } catch (NumberFormatException e) {
		ui.errorMessage("Cannot parse the argument "
			+ line.getOptionValue(rounds.getOpt())
			+ " as integer (number of rounds)");
		return;
	    }
	} else {
	    numberOfRounds = 500;
	}
	ui.infoMessage("number of rounds: " + numberOfRounds);
	interpreter.setNumberOfRounds(numberOfRounds);

	// processes
	if (line.hasOption(processes.getOpt())) {
	    try {
		numberOfProcesses = Integer.parseInt(line
			.getOptionValue(processes.getOpt()));
	    } catch (NumberFormatException e) {
		ui.errorMessage("Cannot parse the argument "
			+ line.getOptionValue(processes.getOpt())
			+ " as integer (number of processes)");
		return;
	    }
	} else {
	    numberOfProcesses = 10;
	}
	ui.infoMessage("number of processes: " + numberOfProcesses);
	interpreter.setNumberOfProcesses(numberOfProcesses);

	// only parsing
	simulate = !line.hasOption(parseOnly.getOpt());
	if (!simulate) {
	    ui.infoMessage("no simulation, only parsing the algorithm");
	}

	// parser
	ui.infoMessage("starting parser..");
	try {
	    String result = interpreter.parse();
	    ui.debugMessage("parser output:\n" + result);
	} catch (RecognitionException e) {
	    ui.error(e);
	    return;
	} catch (RuntimeException e) {
	    ui.error(e);
	    return;
	}
	ui.infoMessage("parser finished");

	// simulator
	if (simulate) {
	    ui.infoMessage("starting simulation..");
	    try {
		interpreter.startSimulation();
	    } catch (RecognitionException e) {
		ui.error(e);
		return;
	    } catch (RuntimeException e) {
		ui.error(e);
		return;
	    }
	    ui.infoMessage("simulation finished");
	}

	// writing file
	ui.infoMessage("write to file..");
	try {
	    interpreter.writeFile();
	} catch (IOException e) {
	    ui.error(e);
	    return;
	}
	ui.infoMessage("writing finished");
    }

    private void printHelpStatement(Options options) {
	// automatically generate the help statement
	HelpFormatter formatter = new HelpFormatter();
	formatter.printHelp(RUN_COMMAND, options);
    }

    public static void main(String[] args) {
	new SimpleInterpreter(args);
    }
}
