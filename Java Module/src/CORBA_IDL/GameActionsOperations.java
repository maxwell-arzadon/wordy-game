package CORBA_IDL;


/**
* CORBA_IDL/GameActionsOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameActions.idl
* Tuesday, May 9, 2023 9:47:20 AM CST
*/

public interface GameActionsOperations 
{
  void login (String username, String password) throws CORBA_IDL.UserNotFoundException, CORBA_IDL.WrongCredentials, CORBA_IDL.UserOnlineException;
  int joinGame (String username);
  int getTimer (int gameID);
  String[] getGamePlayers (int gameID);
  void initializeGame (int gameID);
  boolean runGame (int gameID);
  void sendWord (int gameID, String username, String word) throws CORBA_IDL.NoWordException, CORBA_IDL.ShortWordException, CORBA_IDL.WordRepeatedException, CORBA_IDL.InvalidWordException;
  char[] getCharacters (int gameID);
  String[] getEnteredWords (int gameID);
  String getRoundWinner (int gameID);
  String getGameWinner (int gameID);
  int getNoWinInGame (int gameID, String username);
  String[][] getLeaderboardWinList ();
  String[][] getLeaderBoardLongestWordsList ();
  void quitGame (int gameID, String username);
  void logout (String username);
} // interface GameActionsOperations
