package com.duoduolicai360.mymultifunctionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.duoduolicai360.mymultifunctionapp.ui.LoggerActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by swg on 2017/8/15.
 */
public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
    }

    @OnClick({R.id.btn_log})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_log:
                startActivity(new Intent(MainActivity.this, LoggerActivity.class));
                break;
        }
    }

}
