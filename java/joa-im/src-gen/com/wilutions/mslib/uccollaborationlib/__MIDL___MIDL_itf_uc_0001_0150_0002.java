/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0150_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0150_0002 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0150_0002 ucNotificationUrgencyLow = new __MIDL___MIDL_itf_uc_0001_0150_0002(20);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0002 ucNotificationUrgencyNeutral = new __MIDL___MIDL_itf_uc_0001_0150_0002(50);
  public final static __MIDL___MIDL_itf_uc_0001_0150_0002 ucNotificationUrgencyHigh = new __MIDL___MIDL_itf_uc_0001_0150_0002(80);

  // Integer constants for bitsets and switch statements
  public final static int _ucNotificationUrgencyLow = 20;
  public final static int _ucNotificationUrgencyNeutral = 50;
  public final static int _ucNotificationUrgencyHigh = 80;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0150_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0150_0002 valueOf(int value) {
    switch(value) {
    case 20: return ucNotificationUrgencyLow;
    case 50: return ucNotificationUrgencyNeutral;
    case 80: return ucNotificationUrgencyHigh;
    default: return new __MIDL___MIDL_itf_uc_0001_0150_0002(value);
    }
  }
}
