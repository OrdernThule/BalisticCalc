package com.example.balisticcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonGoToRifle(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
    }
}