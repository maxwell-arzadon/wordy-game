package CORBA_IDL;


/**
* CORBA_IDL/WrongCredentials.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameActions.idl
* Tuesday, May 9, 2023 9:47:20 AM CST
*/

public final class WrongCredentials extends org.omg.CORBA.UserException
{

  public WrongCredentials ()
  {
    super(WrongCredentialsHelper.id());
  } // ctor


  public WrongCredentials (String $reason)
  {
    super(WrongCredentialsHelper.id() + "  " + $reason);
  } // ctor

} // class WrongCredentials
