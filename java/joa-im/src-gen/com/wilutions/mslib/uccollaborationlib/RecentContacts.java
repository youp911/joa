/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RecentContacts.
 * Represents a group of recent contacts. 
 */
@CoClass(guid="{E6162417-23BE-437B-B9D2-7BF6CAC5E829}")
public class RecentContacts extends Dispatch implements IRecentContacts {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetContact(final String _uri, final ByRef<IContact> _value) throws ComException {
    assert(_uri != null);
    assert(_value != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetContact", DISPATCH_METHOD,null,_uri,_value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public GroupType getType() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return GroupType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809345)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809346)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809347)  public IAsynchronousOperation AddContact(final IContact _contact, final Object _groupCallback, final Object _state) throws ComException {
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809347,"AddContact", DISPATCH_METHOD,null,(_contact!=null?_contact:Dispatch.NULL),_groupCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809348)  public IAsynchronousOperation RemoveContact(final IContact pContact, final Object _groupCallback, final Object _state) throws ComException {
    assert(_groupCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809348,"RemoveContact", DISPATCH_METHOD,null,(pContact!=null?pContact:Dispatch.NULL),_groupCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809349)  public IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610809350)  public Boolean CanInvoke(final GroupAction _action, final IContact _contact) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610809350,"CanInvoke", DISPATCH_METHOD,null,_action.value,(_contact!=null?_contact:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610874880)  public IContact GetValueAt(final Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610874880,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  public RecentContacts() throws ComException {
    super("{E6162417-23BE-437B-B9D2-7BF6CAC5E829}", "{DCDEA425-B5F2-4719-A3B4-69FFB9770BE6}");
  }
  protected RecentContacts(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RecentContacts" + super.toString() + "]";
  }
}
