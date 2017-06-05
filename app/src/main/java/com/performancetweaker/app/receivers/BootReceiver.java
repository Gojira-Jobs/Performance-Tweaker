package com.rattlehead666.performancetweaker.app.receivers;

import com.rattlehead666.performancetweaker.app.services.BootService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            context.startService(new Intent(context, BootService.class));
        }
    }
}
