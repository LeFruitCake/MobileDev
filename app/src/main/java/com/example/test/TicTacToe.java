package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TicTacToe extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnReset;

    Boolean player = false;
    TextView turnTV;
    ConstraintLayout gamelayout;

    Boolean win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        win = false;
        btn1 = findViewById(R.id.row01);
        btn2 = findViewById(R.id.row02);
        btn3 = findViewById(R.id.row03);
        btn4 = findViewById(R.id.row11);
        btn5 = findViewById(R.id.row12);
        btn6 = findViewById(R.id.row13);
        btn7 = findViewById(R.id.row21);
        btn8 = findViewById(R.id.row22);
        btn9 = findViewById(R.id.row23);
        btnReset = findViewById(R.id.btnReset);
        gamelayout = findViewById(R.id.gameLayout);
        turnTV = findViewById(R.id.turnTV);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.getText().equals("") && !win){
                    if(player){
                        btn1.setText("O");
                        btn1.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn1.setText("X");
                        btn1.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText().equals("") && !win){
                    if(player){
                        btn2.setText("O");
                        btn2.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn2.setText("X");
                        btn2.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText().equals("") && !win){
                    if(player){
                        btn3.setText("O");
                        btn3.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn3.setText("X");
                        btn3.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText().equals("") && !win){
                    if(player){
                        btn4.setText("O");
                        btn4.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn4.setText("X");
                        btn4.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn5.getText().equals("") && !win){
                    if(player){
                        btn5.setText("O");
                        btn5.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn5.setText("X");
                        btn5.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn6.getText().equals("") && !win){
                    if(player){
                        btn6.setText("O");
                        btn6.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn6.setText("X");
                        btn6.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn7.getText().equals("") && !win){
                    if(player){
                        btn7.setText("O");
                        btn7.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn7.setText("X");
                        btn7.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn8.getText().equals("") && !win){
                    if(player){
                        btn8.setText("O");
                        btn8.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn8.setText("X");
                        btn8.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn9.getText().equals("") && !win){
                    if(player){
                        btn9.setText("O");
                        btn9.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.RED);
                        turnTV.setText("Player X's Turn");
                    }else{
                        btn9.setText("X");
                        btn9.setTextColor(Color.BLACK);
                        player=!player;
                        gamelayout.setBackgroundColor(Color.GREEN);
                        turnTV.setText("Player O's Turn");
                    }
                }
                checkWin();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }
    private void checkWin(){
        if(btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && !btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("")){
            win = true;
        }
        if(btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("")){
            win = true;
        }
        if(btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")){
            win = true;
        }
        if(btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && !btn1.getText().equals("") && !btn4.getText().equals("") && !btn7.getText().equals("")){
            win = true;
        }
        if(btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && !btn2.getText().equals("") && !btn5.getText().equals("") && !btn8.getText().equals("")){
            win = true;
        }
        if(btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) && !btn3.getText().equals("") && !btn6.getText().equals("") && !btn9.getText().equals("")){
            win = true;
        }
        if(btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && !btn1.getText().equals("") && !btn5.getText().equals("") && !btn9.getText().equals("")){
            win = true;
        }
        if(btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && !btn3.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("")){
            win = true;
        }
        if(!btn1.getText().toString().isEmpty() && !btn2.getText().toString().isEmpty() && !btn3.getText().toString().isEmpty() && !btn4.getText().toString().isEmpty() && !btn5.getText().toString().isEmpty() && !btn6.getText().toString().isEmpty() && !btn7.getText().toString().isEmpty() && !btn8.getText().toString().isEmpty() && !btn9.getText().toString().isEmpty() && !win){
            btnReset.setVisibility(View.VISIBLE);
            gamelayout.setBackgroundColor(Color.BLACK);
            turnTV.setText("Draw");
        }
        if(win){
            btnReset.setVisibility(View.VISIBLE);
            gamelayout.setBackgroundColor(Color.BLACK);
            if(!player){
                turnTV.setText("Player O Wins!");
            }else{
                turnTV.setText("Player X Wins!");
            }
        }
    }

    private void reset(){
        gamelayout.setBackgroundColor(Color.RED);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btnReset.setVisibility(View.INVISIBLE);
        win = false;
        turnTV.setText("Player O's Turn");
    }
}