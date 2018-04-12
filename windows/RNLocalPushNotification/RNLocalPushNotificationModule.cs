using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Local.Push.Notification.RNLocalPushNotification
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNLocalPushNotificationModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNLocalPushNotificationModule"/>.
        /// </summary>
        internal RNLocalPushNotificationModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNLocalPushNotification";
            }
        }
    }
}
