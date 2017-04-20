package com.mylogutil.emre.logutillib;

import android.util.Log;

/**
 * Created by EMRE on 20.04.2017.
 */

public class LogDebug {

    private static final String TAG = "Super_Awesome_App";

    public static void d (String message) {
        Log.d(TAG, message);
    }

}
