
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;

public class RNLocalPushNotificationModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNLocalPushNotificationModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNLocalPushNotification";
  }

  @ReactMethod
  public void sendLocalNotification() {
      Log.d("REACT_CLASS", "sendLocalNotificationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
  }
}