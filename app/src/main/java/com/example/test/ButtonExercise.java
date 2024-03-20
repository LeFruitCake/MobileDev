package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {
    Button btnClose,btnToast,btnChangeBtnBackground,btnChangeBackground,btnDisappear;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);
        btnClose = findViewById(R.id.btnClose);
        btnToast = findViewById(R.id.btnToast);
        btnChangeBtnBackground = findViewById(R.id.btnChangeBtnBackground);
        btnChangeBackground = findViewById(R.id.btnChangeBackground);
        btnDisappear = findViewById(R.id.btnDisappear);
        layout = findViewById(R.id.conslayout);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ButtonExercise.this,Return.class);
                startActivity(intent1);
            }
        });
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonExercise.this, "Hello Motherfucker", Toast.LENGTH_SHORT).show();
            }
        });
        btnChangeBtnBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChangeBtnBackground.setBackgroundColor(Color.GREEN);
            }
        });
        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundResource(R.color.black);
            }
        });
        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnDisappear.setVisibility(View.INVISIBLE);
            }
        });
    }
}