package com.example.mymax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendString(View view) {
        Intent intent = new Intent(this, display_MainActivity.class);

        EditText someTextEditText1 = findViewById(R.id.editTextSomeName);
        EditText someTextEditText2 = findViewById(R.id.editTextSomeName2);

        String string1 = someTextEditText1.getText().toString();
        String string2 = someTextEditText2.getText().toString();

        String biggerString = string1.compareTo(string2) > 0 ? string1 : string2;

        intent.putExtra("userInputtedString", biggerString);
        startActivity(intent);
    }
}