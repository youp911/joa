/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Application.
 * 
 */
@CoInterface(guid="{00063001-0000-0000-C000-000000000046}")
public interface _Application extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(12289)  public String getName() throws ComException;
  @DeclDISPID(278)  public String getVersion() throws ComException;
  @DeclDISPID(273)  public _Explorer ActiveExplorer() throws ComException;
  @DeclDISPID(274)  public _Inspector ActiveInspector() throws ComException;
  @DeclDISPID(266)  public Dispatch CreateItem(OlItemType ItemType) throws ComException;
  @DeclDISPID(267)  public Dispatch CreateItemFromTemplate(String TemplatePath, Object InFolder) throws ComException;
  @DeclDISPID(277)  public Dispatch CreateObject(String ObjectName) throws ComException;
  @DeclDISPID(272)  public _NameSpace GetNamespace(String Type) throws ComException;
  @DeclDISPID(275)  public void Quit() throws ComException;
  @DeclDISPID(280)  public com.wilutions.mslib.office.COMAddIns getCOMAddIns() throws ComException;
  @DeclDISPID(281)  public _Explorers getExplorers() throws ComException;
  @DeclDISPID(282)  public _Inspectors getInspectors() throws ComException;
  @DeclDISPID(283)  public com.wilutions.mslib.office.LanguageSettings getLanguageSettings() throws ComException;
  @DeclDISPID(284)  public String getProductCode() throws ComException;
  @DeclDISPID(287)  public Dispatch ActiveWindow() throws ComException;
  @DeclDISPID(64098)  public Dispatch CopyFile(String FilePath, String DestFolderPath) throws ComException;
  @DeclDISPID(64101)  public Search AdvancedSearch(String Scope, Object Filter, Object SearchSubFolders, Object Tag) throws ComException;
  @DeclDISPID(64108)  public Boolean IsSearchSynchronous(String LookInFolders) throws ComException;
  @DeclDISPID(64153)  public _Reminders getReminders() throws ComException;
  @DeclDISPID(64214)  public String getDefaultProfileName() throws ComException;
  @DeclDISPID(64499)  public Boolean getIsTrusted() throws ComException;
  @DeclDISPID(64470)  public Dispatch GetObjectReference(Dispatch Item, OlReferenceType ReferenceType) throws ComException;
  @DeclDISPID(64520)  public com.wilutions.mslib.office.IAssistance getAssistance() throws ComException;
  @DeclDISPID(64553)  public TimeZones getTimeZones() throws ComException;
  @DeclDISPID(64613)  public com.wilutions.mslib.office.PickerDialog getPickerDialog() throws ComException;
  @DeclDISPID(64639)  public void RefreshFormRegionDefinition(String RegionName) throws ComException;
}