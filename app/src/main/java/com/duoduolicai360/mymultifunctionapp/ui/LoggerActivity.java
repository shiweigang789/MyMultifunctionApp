package com.duoduolicai360.mymultifunctionapp.ui;

import android.os.Bundle;
import android.support.compat.BuildConfig;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.duoduolicai360.mymultifunctionapp.R;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by swg on 2017/8/15.
 */
public class LoggerActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logger);
    }

    public void showLog1(View view){
        Logger.d("Tag", "I'm a log which you don't see easily, hehe");
        Logger.d("json content", "{ \"key\": 3, \n \"value\": something}");
        Logger.d("error", "There is a crash somewhere or any warning");
    }

    public void showLog2(View view){
        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.d("message");
        Logger.clearLogAdapters();
    }

    public void showLog3(View view){
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(0)
                .methodOffset(3)
                .tag("My custom tag")
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

        Logger.addLogAdapter(new AndroidLogAdapter(){
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });

        Logger.addLogAdapter(new DiskLogAdapter());

        Logger.w("no thread info and only 1 method");
        Logger.clearLogAdapters();

    }

    public void showLog4(View view){
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(0)
                .build();

        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        Logger.i("no thread info and method info");

        Logger.t("tag").e("Custom tag for only one use");

        Logger.json("{ \"key\": 3, \"value\": something}");

        Logger.d(Arrays.asList("foo", "bar"));

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key1", "value2");

        Logger.d(map);

        Logger.clearLogAdapters();
    }

    public void showLog5(View view){
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(0)
                .tag("MyTag")
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

        Logger.w("my log message with my tag");
    }

}
