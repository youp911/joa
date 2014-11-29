/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoSeries.
 * 
 */
@CoInterface(guid="{000C170B-0000-0000-C000-000000000046}")
public interface IMsoSeries extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(47)  public XlAxisGroup getAxisGroup() throws ComException;
  @DeclDISPID(47)  public void setAxisGroup(XlAxisGroup RHS) throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(112)  public Object ClearFormats() throws ComException;
  @DeclDISPID(551)  public Object Copy() throws ComException;
  @DeclDISPID(157)  public IDispatch DataLabels(Object Index) throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(152)  public Object ErrorBar(XlErrorBarDirection Direction, XlErrorBarInclude Include, XlErrorBarType Type, Object Amount, Object MinusValues) throws ComException;
  @DeclDISPID(159)  public IMsoErrorBars getErrorBars() throws ComException;
  @DeclDISPID(182)  public Integer getExplosion() throws ComException;
  @DeclDISPID(182)  public void setExplosion(Integer RHS) throws ComException;
  @DeclDISPID(261)  public String getFormula() throws ComException;
  @DeclDISPID(261)  public void setFormula(String RHS) throws ComException;
  @DeclDISPID(263)  public String getFormulaLocal() throws ComException;
  @DeclDISPID(263)  public void setFormulaLocal(String RHS) throws ComException;
  @DeclDISPID(264)  public String getFormulaR1C1() throws ComException;
  @DeclDISPID(264)  public void setFormulaR1C1(String RHS) throws ComException;
  @DeclDISPID(265)  public String getFormulaR1C1Local() throws ComException;
  @DeclDISPID(265)  public void setFormulaR1C1Local(String RHS) throws ComException;
  @DeclDISPID(78)  public Boolean getHasDataLabels() throws ComException;
  @DeclDISPID(78)  public void setHasDataLabels(Boolean RHS) throws ComException;
  @DeclDISPID(160)  public Boolean getHasErrorBars() throws ComException;
  @DeclDISPID(160)  public void setHasErrorBars(Boolean RHS) throws ComException;
  @DeclDISPID(129)  public IMsoInterior getInterior() throws ComException;
  @DeclDISPID(1663)  public ChartFillFormat getFill() throws ComException;
  @DeclDISPID(132)  public Boolean getInvertIfNegative() throws ComException;
  @DeclDISPID(132)  public void setInvertIfNegative(Boolean RHS) throws ComException;
  @DeclDISPID(73)  public Integer getMarkerBackgroundColor() throws ComException;
  @DeclDISPID(73)  public void setMarkerBackgroundColor(Integer RHS) throws ComException;
  @DeclDISPID(74)  public XlColorIndex getMarkerBackgroundColorIndex() throws ComException;
  @DeclDISPID(74)  public void setMarkerBackgroundColorIndex(XlColorIndex RHS) throws ComException;
  @DeclDISPID(75)  public Integer getMarkerForegroundColor() throws ComException;
  @DeclDISPID(75)  public void setMarkerForegroundColor(Integer RHS) throws ComException;
  @DeclDISPID(76)  public XlColorIndex getMarkerForegroundColorIndex() throws ComException;
  @DeclDISPID(76)  public void setMarkerForegroundColorIndex(XlColorIndex RHS) throws ComException;
  @DeclDISPID(231)  public Integer getMarkerSize() throws ComException;
  @DeclDISPID(231)  public void setMarkerSize(Integer RHS) throws ComException;
  @DeclDISPID(72)  public XlMarkerStyle getMarkerStyle() throws ComException;
  @DeclDISPID(72)  public void setMarkerStyle(XlMarkerStyle RHS) throws ComException;
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(110)  public void setName(String RHS) throws ComException;
  @DeclDISPID(211)  public Object Paste() throws ComException;
  @DeclDISPID(161)  public XlChartPictureType getPictureType() throws ComException;
  @DeclDISPID(161)  public void setPictureType(XlChartPictureType RHS) throws ComException;
  @DeclDISPID(162)  public Double getPictureUnit() throws ComException;
  @DeclDISPID(162)  public void setPictureUnit(Double RHS) throws ComException;
  @DeclDISPID(228)  public Integer getPlotOrder() throws ComException;
  @DeclDISPID(228)  public void setPlotOrder(Integer RHS) throws ComException;
  @DeclDISPID(70)  public IDispatch Points(Object Index) throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(163)  public Boolean getSmooth() throws ComException;
  @DeclDISPID(163)  public void setSmooth(Boolean RHS) throws ComException;
  @DeclDISPID(154)  public IDispatch Trendlines(Object Index) throws ComException;
  @DeclDISPID(108)  public Integer getType() throws ComException;
  @DeclDISPID(108)  public void setType(Integer RHS) throws ComException;
  @DeclDISPID(1400)  public XlChartType getChartType() throws ComException;
  @DeclDISPID(1400)  public void setChartType(XlChartType RHS) throws ComException;
  @DeclDISPID(1401)  public void ApplyCustomType(XlChartType ChartType) throws ComException;
  @DeclDISPID(164)  public Object getValues() throws ComException;
  @DeclDISPID(164)  public void setValues(Object RHS) throws ComException;
  @DeclDISPID(1111)  public Object getXValues() throws ComException;
  @DeclDISPID(1111)  public void setXValues(Object RHS) throws ComException;
  @DeclDISPID(1664)  public Object getBubbleSizes() throws ComException;
  @DeclDISPID(1664)  public void setBubbleSizes(Object RHS) throws ComException;
  @DeclDISPID(1403)  public XlBarShape getBarShape() throws ComException;
  @DeclDISPID(1403)  public void setBarShape(XlBarShape RHS) throws ComException;
  @DeclDISPID(1659)  public Boolean getApplyPictToSides() throws ComException;
  @DeclDISPID(1659)  public void setApplyPictToSides(Boolean RHS) throws ComException;
  @DeclDISPID(1660)  public Boolean getApplyPictToFront() throws ComException;
  @DeclDISPID(1660)  public void setApplyPictToFront(Boolean RHS) throws ComException;
  @DeclDISPID(1661)  public Boolean getApplyPictToEnd() throws ComException;
  @DeclDISPID(1661)  public void setApplyPictToEnd(Boolean RHS) throws ComException;
  @DeclDISPID(1665)  public Boolean getHas3DEffect() throws ComException;
  @DeclDISPID(1665)  public void setHas3DEffect(Boolean RHS) throws ComException;
  @DeclDISPID(103)  public Boolean getShadow() throws ComException;
  @DeclDISPID(103)  public void setShadow(Boolean RHS) throws ComException;
  @DeclDISPID(1394)  public Boolean getHasLeaderLines() throws ComException;
  @DeclDISPID(1394)  public void setHasLeaderLines(Boolean RHS) throws ComException;
  @DeclDISPID(1666)  public IMsoLeaderLines getLeaderLines() throws ComException;
  @DeclDISPID(1922)  public Object ApplyDataLabels(XlDataLabelsType Type, Object IMsoLegendKey, Object AutoText, Object HasLeaderLines, Object ShowSeriesName, Object ShowCategoryName, Object ShowValue, Object ShowPercentage, Object ShowBubbleSize, Object Separator) throws ComException;
  @DeclDISPID(1610743890)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(2649)  public Double getPictureUnit2() throws ComException;
  @DeclDISPID(2649)  public void setPictureUnit2(Double RHS) throws ComException;
  @DeclDISPID(1924)  public Integer getPlotColorIndex() throws ComException;
  @DeclDISPID(2884)  public Integer getInvertColor() throws ComException;
  @DeclDISPID(2884)  public void setInvertColor(Integer RHS) throws ComException;
  @DeclDISPID(2885)  public XlColorIndex getInvertColorIndex() throws ComException;
  @DeclDISPID(2885)  public void setInvertColorIndex(XlColorIndex RHS) throws ComException;
  @DeclDISPID(2887)  public Boolean getIsFiltered() throws ComException;
  @DeclDISPID(2887)  public void setIsFiltered(Boolean RHS) throws ComException;
}
