package com.example.navya.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import static android.R.attr.button;

/**
 * Created by navya on 12/9/2016.
 */

public class SecondActivity extends AppCompatActivity {

    private RelativeLayout secondact;
    //private activity_second activity_second
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        secondact = (RelativeLayout) findViewById(R.id.secondact);
        //Button redbtn = (Button) findViewById(R.id.redbutton);
        //Button Grnbtn = (Button) findViewById(R.id.greenbutton);

}

    public void backred(View view) {
        secondact.setBackgroundColor(Color.RED);
    }

    public void backgreen(View view) {
        secondact.setBackgroundColor(Color.GREEN);
    }
}
