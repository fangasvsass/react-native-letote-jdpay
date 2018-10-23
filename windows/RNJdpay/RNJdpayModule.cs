using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Jdpay.RNJdpay
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNJdpayModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNJdpayModule"/>.
        /// </summary>
        internal RNJdpayModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNJdpay";
            }
        }
    }
}
