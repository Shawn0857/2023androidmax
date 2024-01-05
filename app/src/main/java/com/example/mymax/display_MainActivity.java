package com.example.mymax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class display_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_main);
        Intent intent = getIntent();
        String outputString =intent.getStringExtra("userInputtedString");

        TextView showStringTxv =(TextView) findViewById(R.id.testviewShowText);
        showStringTxv.setText(outputString);
    }
}