package model;

public interface Function {
	public void start(int number,int fizz, int buzz, int time);
	public void continueGame(int number);
	public void end(String type, int number);
	public void setConfiguration();
}
