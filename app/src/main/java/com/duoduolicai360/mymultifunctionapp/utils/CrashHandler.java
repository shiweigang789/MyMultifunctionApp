package com.duoduolicai360.mymultifunctionapp.utils;

import com.duoduolicai360.mymultifunctionapp.BuildConfig;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * Created by swg on 2017/8/15.
 */

public class CrashHandler implements UncaughtExceptionHandler{

    private static final String TAG = "CrashHandler";
    public static final Boolean DEBUG = BuildConfig.DEBUG;

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

    }
}
