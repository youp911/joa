/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ApplicationEvents_10.
 * 
 */
@CoInterface(guid="{0006300E-0000-0000-C000-000000000046}")
public interface ApplicationEvents_10 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61442)  public void onItemSend(final IDispatch Item, final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(61443)  public void onNewMail() throws ComException;
  @DeclDISPID(61444)  public void onReminder(final IDispatch Item) throws ComException;
  @DeclDISPID(61445)  public void onOptionsPagesAdd(final PropertyPages Pages) throws ComException;
  @DeclDISPID(61446)  public void onStartup() throws ComException;
  @DeclDISPID(61447)  public void onQuit() throws ComException;
  @DeclDISPID(64106)  public void onAdvancedSearchComplete(final Search SearchObject) throws ComException;
  @DeclDISPID(64107)  public void onAdvancedSearchStopped(final Search SearchObject) throws ComException;
  @DeclDISPID(64144)  public void onMAPILogonComplete() throws ComException;
}
