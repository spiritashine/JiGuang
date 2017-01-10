package com.hujie.jiguang;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by hujie on 2017/1/10.
 */

public class JPushReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        Bundle bundle = intent.getExtras();
        String title=null;
        if (TextUtils.equals(action, JPushInterface.ACTION_REGISTRATION_ID)){
             title = bundle.getString(JPushInterface.EXTRA_REGISTRATION_ID);
        }else if (TextUtils.equals(action, JPushInterface.ACTION_MESSAGE_RECEIVED)){
             title = bundle.getString(JPushInterface.EXTRA_TITLE);

        }else if (TextUtils.equals(action, JPushInterface.ACTION_NOTIFICATION_OPENED)){
             title = bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);

        }else if (TextUtils.equals(action, JPushInterface.ACTION_NOTIFICATION_RECEIVED)){
             title = bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);

        }
        Log.i("=========", "onReceive: "+title);
    }
}
