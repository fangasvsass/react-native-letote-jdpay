
#import "RNJdpay.h"
#import "JDPAuthSDK.h"
@implementation RNJdpay

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(pay:(NSDictionary *)attributes findEventsWithResolver:(RCTPromiseResolveBlock)resolve
                  rejecter:(RCTPromiseRejectBlock)reject){
    UIViewController *rootViewController = [UIApplication sharedApplication].delegate.window.rootViewController;
    [[JDPAuthSDK sharedJDPay] payWithViewController:rootViewController orderId: [attributes objectForKey:@"orderId"] signData:[attributes objectForKey:@"order_sign"] completion:^(NSDictionary *resultDict) {
        resolve(resultDict);
    }];
}

@end
  
