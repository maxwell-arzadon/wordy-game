package CORBA_IDL;

/**
* CORBA_IDL/UserNotFoundExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameActions.idl
* Tuesday, May 9, 2023 9:47:20 AM CST
*/

public final class UserNotFoundExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public CORBA_IDL.UserNotFoundException value = null;

  public UserNotFoundExceptionHolder ()
  {
  }

  public UserNotFoundExceptionHolder (CORBA_IDL.UserNotFoundException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CORBA_IDL.UserNotFoundExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CORBA_IDL.UserNotFoundExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CORBA_IDL.UserNotFoundExceptionHelper.type ();
  }

}
