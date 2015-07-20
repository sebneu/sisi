package ui;

public interface UserInterface {

	public void errorMessage(String string);

	public String debugMessage(String string);
	
	public String infoMessage(String string);

	public void error(Exception e);

	public void enableDebugMessages(boolean enable);
}
