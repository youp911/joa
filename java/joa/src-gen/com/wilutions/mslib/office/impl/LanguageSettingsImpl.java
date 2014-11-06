/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A38-A463-DB41-5DAE-69E7A5F7FCBC}")
public class LanguageSettingsImpl extends Dispatch implements com.wilutions.mslib.office.LanguageSettings {
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
  @DeclDISPID(1)  public Integer getLanguageID(com.wilutions.mslib.office.MsoAppLanguageID Id) throws ComException {
    assert(Id != null);
    final Object obj = this._dispatchCall(1,"LanguageID", DISPATCH_PROPERTYGET,null,Id.value);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public Boolean getLanguagePreferredForEditing(com.wilutions.mslib.office.MsoLanguageID lid) throws ComException {
    assert(lid != null);
    final Object obj = this._dispatchCall(2,"LanguagePreferredForEditing", DISPATCH_PROPERTYGET,null,lid.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public LanguageSettingsImpl(String progId) throws ComException {
    super(progId);
  }
  protected LanguageSettingsImpl(long ndisp) {
    super(ndisp);
  }
  public LanguageSettingsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[LanguageSettingsImpl" + super.toString() + "]";
  }
}