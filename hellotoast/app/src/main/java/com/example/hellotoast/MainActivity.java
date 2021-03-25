package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Textview text;
    int count=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.ts);
        if(savedInstanceState!=null&&savedInstanceState.containsKey("any"))
            count=savedInstanceState.getInt(key."any")
                    text.setText(getString().valueOf())
    }

    public void showtoast(View view) {

    }

    public void showcount(View view) {
    }
}