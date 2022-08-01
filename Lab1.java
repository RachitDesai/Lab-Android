package com.example.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lab1 extends AppCompatActivity {
    EditText et1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);

        et1 = (EditText)findViewById(R.id.et1) ;
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> {
            String name = et1.getText().toString();

            Toast toast=Toast.makeText(this,
                    "Welcome to the world of Android "+ name ,Toast.LENGTH_LONG);
            toast.show(); });


    }
}