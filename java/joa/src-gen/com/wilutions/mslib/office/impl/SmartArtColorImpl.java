/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AA5-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SmartArtColorImpl extends Dispatch implements com.wilutions.mslib.office.SmartArtColor {
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
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(2,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(3,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(4)  public String getDescription() throws ComException {
    final Object obj = this._dispatchCall(4,"Description", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public String getCategory() throws ComException {
    final Object obj = this._dispatchCall(5,"Category", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public SmartArtColorImpl(String progId) throws ComException {
    super(progId);
  }
  protected SmartArtColorImpl(long ndisp) {
    super(ndisp);
  }
  public SmartArtColorImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SmartArtColorImpl" + super.toString() + "]";
  }
}