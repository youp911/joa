/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ThemeColor.
 * 
 */
@CoInterface(guid="{000C03A1-0000-0000-C000-000000000046}")
public interface ThemeColor extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoRGBType getRGB() throws ComException;
  @DeclDISPID(0)  public void setRGB(final MsoRGBType value) throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809347)  public MsoThemeColorSchemeIndex getThemeColorSchemeIndex() throws ComException;
}
