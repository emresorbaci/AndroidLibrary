package com.mylogutil.emre.logutillib;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by EMRE on 20.04.2017.
 */

public class LogDebug {

    private static final String TAG = "Super_Awesome_App";

    public static void d (String message) {
        Log.d(TAG, message);
    }

    public void makeToast (Context context, String toastMessage) {
        Toast.makeText(context,toastMessage,Toast.LENGTH_LONG).show();
    }

}
