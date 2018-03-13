package ma.um6p.iot.iotplatformlibrary;

import android.util.Log;

/**
 * Created by Abdeljalil BENETTALEB on 3/13/2018.
 */

public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
