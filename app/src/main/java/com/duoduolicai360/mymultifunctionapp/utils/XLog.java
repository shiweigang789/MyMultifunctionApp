package com.duoduolicai360.mymultifunctionapp.utils;

import android.util.Log;

/**
 * Created by swg on 2017/8/15.
 * log for android {@link Log logger}
 */
public final class XLog {

    private static final String LOG_FORMAT = "%1$s\n%2$s";
    private static volatile boolean DEBUG = false;
    private String logBody;

    private XLog() {
    }

    public static void enableLogging() {
        DEBUG = true;
    }

    public static boolean isLogging() {
        return DEBUG;
    }

    public static void disableLogging() {
        DEBUG = false;
    }

    private static void log(String tag, int priority, Throwable ex, String message, Object... args) {
        if (!DEBUG)
            return;

        if (args != null && args.length > 0) {
            message = String.format(message, args);
        }

        String log;
        if (ex == null) {
            log = message;
        } else {
            String logMessage = message == null ? ex.getMessage() : message;
            String logBody = Log.getStackTraceString(ex);
            log = String.format(LOG_FORMAT,logMessage,logBody);
        }

        if (tag == null){
            tag = "XLog";
        }
        Log.println(priority,tag,"X-LOG....." + log);

    }

}
