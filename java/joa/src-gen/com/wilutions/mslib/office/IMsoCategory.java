/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoCategory.
 * 
 */
@CoInterface(guid="{000C1733-0000-0000-C000-000000000046}")
public interface IMsoCategory extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(2887)  public Boolean getIsFiltered() throws ComException;
  @DeclDISPID(2887)  public void setIsFiltered(final Boolean pfIsFiltered) throws ComException;
}
