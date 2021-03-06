import { NativeModules, Platform } from 'react-native'

const { RNJdpay } = NativeModules
class JdPay {
  pay = async (authorization_details, appId) => {
    try {
      let authorObject = JSON.parse(authorization_details)
      let result
      if (Platform.OS === 'ios') result = await RNJdpay.pay(authorObject.jdpay)
      else {
        result = await RNJdpay.pay(authorObject.jdpay, appId)
      }
      if (typeof result === 'string') {
        result = JSON.parse(result)
      }
      if (result.payStatus === 'JDP_PAY_SUCCESS') {
        return this.sendPaySuccess()
      } else {
        return this.sendPayFail(result)
      }
    } catch (e) {
      console.log(e)
    }
  }
  sendPaySuccess = () => {
    const result = {}
    result.errCode = 0
    return result
  }
  sendPayFail = data => {
    const result = {}
    //支付失败
    result.errCode = -1
    //京东返回的errorcode
    if (data && data.errorCode) {
      result.error = data.errorCode
    }
    return result
  }
}
JdPay = new JdPay()
export default JdPay
