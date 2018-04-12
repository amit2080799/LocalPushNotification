
#import "RNLocalPushNotification.h"

@implementation RNLocalPushNotification

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

@end
  