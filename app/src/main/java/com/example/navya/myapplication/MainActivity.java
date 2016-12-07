package com.example.navya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import static android.R.attr.button;
import static android.R.id.button1;
import static android.R.id.button2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout relativeLayout;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(MainActivity.this);
        button2.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "Button clicked");
    }
}
