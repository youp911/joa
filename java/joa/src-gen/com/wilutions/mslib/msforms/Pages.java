/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * Pages.
 * 
 */
@CoInterface(guid="{92E11A03-7358-11CE-80CB-00AA00611080}")
public interface Pages extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(60)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(final Object varg) throws ComException;
  @DeclDISPID(1610743811)  public Object Enum() throws ComException;
  @DeclDISPID(66)  public Page Add(final Object bstrName, final Object bstrCaption, final Object lIndex) throws ComException;
  @DeclDISPID(1610743813)  public Page _AddCtrl(final Integer clsid, final String bstrName, final String bstrCaption) throws ComException;
  @DeclDISPID(1610743814)  public Page _InsertCtrl(final Integer clsid, final String bstrName, final String bstrCaption, final Integer lIndex) throws ComException;
  @DeclDISPID(1610743815)  public Control _GetItemByIndex(final Integer lIndex) throws ComException;
  @DeclDISPID(1610743816)  public Control _GetItemByName(final String pstrName) throws ComException;
  @DeclDISPID(67)  public void Remove(final Object varg) throws ComException;
  @DeclDISPID(62)  public void Clear() throws ComException;
}
