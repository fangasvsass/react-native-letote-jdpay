//
//  JDPAuthSDK.h
//  JDPAuthSDK
//
//  Created by dulinlin on 16/12/27.
//  Copyright © 2016年 dulinlin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "JDPAuthObject.h"
#import <UIKit/UIKit.h>

@interface JDPAuthSDK : NSObject

/**
 *
 *
 *  @return JDPAuthSDK 单例
 */
+ (JDPAuthSDK *)sharedJDPay;

/**
 *  授权登录处理URL
 *
 *  @param url url
 *
 *  @return 处理结果
 */
- (BOOL)handleOpenURL:(NSURL*)url;

/**
 *  京东支付注册 服务
 *
 *  @param appID       注册的appID
 *  @param merchantID   注册的商户号
 *
 */

- (void)registServiceWithAppID:(NSString *)appID merchantID:(NSString *)merchantID;

/**
 *  唤起京东支付
 *
 *  @param viewController   推出H5页面的视图
 *  @param orderId          订单号
 *  @param signData         验签数据
 *  @param completeCallBack 支付完成回调
 */
- (void)payWithViewController:(UIViewController *)viewController
                      orderId:(NSString *)orderId
                     signData:(NSString *)signData
                   completion:(JDPAuthCompletionBlock)completeCallBack;


/**
 *  唤起京东支付
 *
 *  @param viewController   推出H5页面的视图
 *  @param orderId          订单号
 *  @param signData         验签数据
 *  @param extraInfo        扩展数据，非必传，业务无特殊要求则传nil
        ps:extraInfo :          @{@"bizTag":@"CPAY"}          bizTag:支付标识，必传
 
 *  @param completeCallBack 支付完成回调
 */
- (void)payWithViewController:(UIViewController *)viewController
                      orderId:(NSString *)orderId
                     signData:(NSString *)signData
                     extraInfo:(NSDictionary *)extraInfo
                   completion:(JDPAuthCompletionBlock)completeCallBack;

/*
 * 地铁专用
 * @param viewController   推出H5页面的视图
 * @param bizType 业务类型，地铁传"openAccount"
 * @param jsonStr json串，{ "merchantNo":"商户号"，
                                 "sign":"数据签名"，
                               "userId":用户Id"，
                            "authToken":"用户信息标识"}
 */


- (void)openAccountWithViewController:(UIViewController *)viewController
                              bizType:(NSString *)bizType
                              jsonStr:(NSString *)jsonStr
                           completion:(JDPAuthCompletionBlock)completeCallBack;

- (NSString *)version;

@end
