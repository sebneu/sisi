package ui;

public class Console implements UserInterface {
    private boolean debug;

    public void errorMessage(String string) {
	System.err.println("ERROR: " + string);
    }

    public String debugMessage(String string) {
	if (debug) {
	    System.out.print("DEBUG: " + string + "\n");
	    return string + "\n";
	}
	return "";
    }

    public String infoMessage(String string) {
	System.out.print("INFO: " + string + "\n");
	return string + "\n";
    }

    public void error(Exception e) {
	System.err.print("ERROR: " + e.getMessage() + "\n");
    }

    @Override
    public void enableDebugMessages(boolean enable) {
	debug = enable;
    }
}
