package model;

public interface Function {
	public void startGame(boolean pPlayer);
	public void continueGame(boolean pPlayer, String pPosition,String pValue);
	public void endGame(String pMessage, String pPosition,String pValue);
	public void disableBottom();
	public void setBottomText(String pPosition, String pValue);

}
