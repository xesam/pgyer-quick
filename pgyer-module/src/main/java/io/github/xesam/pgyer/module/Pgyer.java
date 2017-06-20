package io.github.xesam.pgyer.module;

import android.app.Activity;
import android.content.Context;

import com.pgyersdk.update.PgyUpdateManager;

/**
 * Created by xesamguo@gmail.com on 17-6-20.
 */

public class Pgyer {

    public static final int UPDATE = 0;

    public static void register(Context context, int service) {
        if (service == UPDATE) {
            if (context instanceof Activity) {
                PgyUpdateManager.register((Activity) context, context.getResources().getString(R.string.pgyer_id));
            }
        }
    }

    public static void unregister(int service) {
        if (service == UPDATE) {
            PgyUpdateManager.unregister();
        }
    }
}
