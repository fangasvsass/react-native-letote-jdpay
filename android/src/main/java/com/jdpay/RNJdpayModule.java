
package com.jdpay;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.jdpaysdk.author.Constants;
import com.jdpaysdk.author.JDPayAuthor;

public class RNJdpayModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    Promise promise;


    public RNJdpayModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        reactContext.addActivityEventListener(mActivityEventListener);
    }

    @Override
    public String getName() {
        return "RNJdpay";
    }

    @ReactMethod
    public void pay(ReadableMap readableMap,String appId, Promise promise) {
        try {
            this.promise = promise;
            JDPayAuthor jdPayAuthor = new JDPayAuthor();
            String orderId = readableMap.getString("orderId");
            String merchant = readableMap.getString("merchant");
            String signData = readableMap.getString("order_sign");
            jdPayAuthor.author(reactContext.getCurrentActivity(), orderId, merchant, appId, signData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final ActivityEventListener mActivityEventListener = new BaseActivityEventListener() {

        @Override
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent intent) {
            if (Constants.PAY_RESPONSE_CODE == resultCode) {
                String result = intent.getStringExtra(JDPayAuthor.JDPAY_RESULT);
                if (promise != null) {
                    promise.resolve(result);
                }
            }

        }
    };

}
