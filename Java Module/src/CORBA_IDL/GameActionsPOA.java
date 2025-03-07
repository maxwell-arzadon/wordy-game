package CORBA_IDL;


/**
* CORBA_IDL/GameActionsPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameActions.idl
* Tuesday, May 9, 2023 9:47:20 AM CST
*/

public abstract class GameActionsPOA extends org.omg.PortableServer.Servant
 implements CORBA_IDL.GameActionsOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("login", new java.lang.Integer (0));
    _methods.put ("joinGame", new java.lang.Integer (1));
    _methods.put ("getTimer", new java.lang.Integer (2));
    _methods.put ("getGamePlayers", new java.lang.Integer (3));
    _methods.put ("initializeGame", new java.lang.Integer (4));
    _methods.put ("runGame", new java.lang.Integer (5));
    _methods.put ("sendWord", new java.lang.Integer (6));
    _methods.put ("getCharacters", new java.lang.Integer (7));
    _methods.put ("getEnteredWords", new java.lang.Integer (8));
    _methods.put ("getRoundWinner", new java.lang.Integer (9));
    _methods.put ("getGameWinner", new java.lang.Integer (10));
    _methods.put ("getNoWinInGame", new java.lang.Integer (11));
    _methods.put ("getLeaderboardWinList", new java.lang.Integer (12));
    _methods.put ("getLeaderBoardLongestWordsList", new java.lang.Integer (13));
    _methods.put ("quitGame", new java.lang.Integer (14));
    _methods.put ("logout", new java.lang.Integer (15));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CORBA_IDL/GameActions/login
       {
         try {
           String username = in.read_string ();
           String password = in.read_string ();
           this.login (username, password);
           out = $rh.createReply();
         } catch (CORBA_IDL.UserNotFoundException $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.UserNotFoundExceptionHelper.write (out, $ex);
         } catch (CORBA_IDL.WrongCredentials $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.WrongCredentialsHelper.write (out, $ex);
         } catch (CORBA_IDL.UserOnlineException $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.UserOnlineExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // CORBA_IDL/GameActions/joinGame
       {
         String username = in.read_string ();
         int $result = (int)0;
         $result = this.joinGame (username);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // CORBA_IDL/GameActions/getTimer
       {
         int gameID = in.read_long ();
         int $result = (int)0;
         $result = this.getTimer (gameID);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // CORBA_IDL/GameActions/getGamePlayers
       {
         int gameID = in.read_long ();
         String $result[] = null;
         $result = this.getGamePlayers (gameID);
         out = $rh.createReply();
         CORBA_IDL.wordsHelper.write (out, $result);
         break;
       }

       case 4:  // CORBA_IDL/GameActions/initializeGame
       {
         int gameID = in.read_long ();
         this.initializeGame (gameID);
         out = $rh.createReply();
         break;
       }

       case 5:  // CORBA_IDL/GameActions/runGame
       {
         int gameID = in.read_long ();
         boolean $result = false;
         $result = this.runGame (gameID);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 6:  // CORBA_IDL/GameActions/sendWord
       {
         try {
           int gameID = in.read_long ();
           String username = in.read_string ();
           String word = in.read_string ();
           this.sendWord (gameID, username, word);
           out = $rh.createReply();
         } catch (CORBA_IDL.NoWordException $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.NoWordExceptionHelper.write (out, $ex);
         } catch (CORBA_IDL.ShortWordException $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.ShortWordExceptionHelper.write (out, $ex);
         } catch (CORBA_IDL.WordRepeatedException $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.WordRepeatedExceptionHelper.write (out, $ex);
         } catch (CORBA_IDL.InvalidWordException $ex) {
           out = $rh.createExceptionReply ();
           CORBA_IDL.InvalidWordExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 7:  // CORBA_IDL/GameActions/getCharacters
       {
         int gameID = in.read_long ();
         char $result[] = null;
         $result = this.getCharacters (gameID);
         out = $rh.createReply();
         CORBA_IDL.charListHelper.write (out, $result);
         break;
       }

       case 8:  // CORBA_IDL/GameActions/getEnteredWords
       {
         int gameID = in.read_long ();
         String $result[] = null;
         $result = this.getEnteredWords (gameID);
         out = $rh.createReply();
         CORBA_IDL.wordsHelper.write (out, $result);
         break;
       }

       case 9:  // CORBA_IDL/GameActions/getRoundWinner
       {
         int gameID = in.read_long ();
         String $result = null;
         $result = this.getRoundWinner (gameID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 10:  // CORBA_IDL/GameActions/getGameWinner
       {
         int gameID = in.read_long ();
         String $result = null;
         $result = this.getGameWinner (gameID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 11:  // CORBA_IDL/GameActions/getNoWinInGame
       {
         int gameID = in.read_long ();
         String username = in.read_string ();
         int $result = (int)0;
         $result = this.getNoWinInGame (gameID, username);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 12:  // CORBA_IDL/GameActions/getLeaderboardWinList
       {
         String $result[][] = null;
         $result = this.getLeaderboardWinList ();
         out = $rh.createReply();
         CORBA_IDL.leaderboardListHelper.write (out, $result);
         break;
       }

       case 13:  // CORBA_IDL/GameActions/getLeaderBoardLongestWordsList
       {
         String $result[][] = null;
         $result = this.getLeaderBoardLongestWordsList ();
         out = $rh.createReply();
         CORBA_IDL.leaderboardListHelper.write (out, $result);
         break;
       }

       case 14:  // CORBA_IDL/GameActions/quitGame
       {
         int gameID = in.read_long ();
         String username = in.read_string ();
         this.quitGame (gameID, username);
         out = $rh.createReply();
         break;
       }

       case 15:  // CORBA_IDL/GameActions/logout
       {
         String username = in.read_string ();
         this.logout (username);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CORBA_IDL/GameActions:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GameActions _this() 
  {
    return GameActionsHelper.narrow(
    super._this_object());
  }

  public GameActions _this(org.omg.CORBA.ORB orb) 
  {
    return GameActionsHelper.narrow(
    super._this_object(orb));
  }


} // class GameActionsPOA
