package com.android.sample.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.sample.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textValue);
        textView.setText(String.valueOf(Test.VALUE));
//        textView.setText(String.valueOf(Test.TEXT_VALUE));
    }
}
