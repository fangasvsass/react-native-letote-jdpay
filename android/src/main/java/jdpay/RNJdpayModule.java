
package jdpay;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNJdpayModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNJdpayModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNJdpay";
  }
    @ReactMethod
    public void author() {
        JDPayAuthor jdPayAuthor = new JDPayAuthor();
        String orderId = "xxxx";
        String merchant = "111147561003";
        String appId = "xxxx";
        String signData = "xxxxx";
        jdPayAuthor.author(reactContext.getCurrentActivity(), orderId, merchant, appId, signData);
    }
}
