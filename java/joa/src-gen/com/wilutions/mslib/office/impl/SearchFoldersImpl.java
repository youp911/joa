/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A01-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SearchFoldersImpl extends Dispatch implements com.wilutions.mslib.office.SearchFolders {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.ScopeFolder getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.ScopeFolderImpl.class);
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(3)  public void Add(com.wilutions.mslib.office.ScopeFolder ScopeFolder) throws ComException {
    this._dispatchCall(3,"Add", DISPATCH_METHOD,null,(ScopeFolder!=null?ScopeFolder:Dispatch.NULL));
  }
  @DeclDISPID(4)  public void Remove(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(4,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public SearchFoldersImpl(String progId) throws ComException {
    super(progId);
  }
  protected SearchFoldersImpl(long ndisp) {
    super(ndisp);
  }
  public SearchFoldersImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SearchFoldersImpl" + super.toString() + "]";
  }
}