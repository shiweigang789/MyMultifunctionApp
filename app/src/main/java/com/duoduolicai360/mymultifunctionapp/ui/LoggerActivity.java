package com.duoduolicai360.mymultifunctionapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.duoduolicai360.mymultifunctionapp.R;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

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

    }

    public void showLog4(View view){

    }

    public void showLog5(View view){

    }

}
