/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * WebPageFont.
 * 
 */
@CoInterface(guid="{000C0913-0000-0000-C000-000000000046}")
public interface WebPageFont extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(10)  public String getProportionalFont() throws ComException;
  @DeclDISPID(10)  public void setProportionalFont(final String value) throws ComException;
  @DeclDISPID(11)  public Float getProportionalFontSize() throws ComException;
  @DeclDISPID(11)  public void setProportionalFontSize(final Float value) throws ComException;
  @DeclDISPID(12)  public String getFixedWidthFont() throws ComException;
  @DeclDISPID(12)  public void setFixedWidthFont(final String value) throws ComException;
  @DeclDISPID(13)  public Float getFixedWidthFontSize() throws ComException;
  @DeclDISPID(13)  public void setFixedWidthFontSize(final Float value) throws ComException;
}
