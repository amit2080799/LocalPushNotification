
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;

import android.support.v4.app.NotificationCompat.Builder;

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
      Log.d("REACT_CLASS", "sendLocalNotificationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn 1111111111111111111111111111111111");
      NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
      .setSmallIcon(R.drawable.icon_transperent)
              .setContentTitle("textTitle")
              .setContentText("textContent")
              .setPriority(NotificationCompat.PRIORITY_DEFAULT);

  }
}