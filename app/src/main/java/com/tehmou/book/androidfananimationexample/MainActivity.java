package com.tehmou.book.androidfananimationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FanView fanView = (FanView) findViewById(R.id.fan_view);
        View veilView = findViewById(R.id.veil);
    }
}
