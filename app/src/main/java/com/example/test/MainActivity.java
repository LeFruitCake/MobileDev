package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCalculator, btnButtonExercise,btnTicTacToe;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculator = findViewById(R.id.calculatorBtn);
        btnButtonExercise = findViewById(R.id.btnExerciseBtn);
        btnTicTacToe = findViewById(R.id.btnTicTacToe);

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Calculator.class);
                startActivity(intent1);
            }
        });

        btnButtonExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,ButtonExercise.class);
                startActivity(intent2);
            }
        });

        btnTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,TicTacToe.class);
                startActivity(intent3);
            }
        });
    }
}