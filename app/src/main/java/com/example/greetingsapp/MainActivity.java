package com.example.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditText;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    EditText = findViewById(R.id.editTextText);
    Button = findViewById(R.id.button);

    Button.setOnClickListener(new View.OnClickListener() {;
        @Override
        public void onClick(View view) {
            String greeting = EditText.getText().toString();
            Toast.makeText(MainActivity.this,"Welcome " + greeting + " to our app", Toast.LENGTH_LONG).show();
            EditText.setText("");
        }
    });


    }
}