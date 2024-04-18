package com.example.test;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Match3 extends AppCompatActivity {
//    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25;
    Button[][] buttons = new Button[5][5];
    Button restart;
    static final int cRed = 0, cBlue = 1, cGreen=2;
    int[] colors = {Color.RED,Color.BLUE,Color.GREEN};

    private int lastClickedRow = -1;
    private int lastClickedCol = -1;

    private int score = 0;

    TextView resultTV;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);
        resultTV = findViewById(R.id.scoreTV);
        restart = findViewById(R.id.buttonRestart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                setGame();
                while(checkMatch()){
                    setGame();
                }
                resultTV.setText("Score: "+score);
            }
        });
        for(int row = 0;row<5;row++){
            for(int col=0;col<5;col++){
                String resID = "button"+row+col;
                buttons[row][col] = findViewById(this.getResources().getIdentifier(resID,"id",this.getPackageName()));
                buttons[row][col].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int clickedRow = -1;
                        int clickedCol = -1;
                        for (int r = 0; r < 5; r++) {
                            for (int c = 0; c < 5; c++) {
                                if (buttons[r][c] == v) {
                                    clickedRow = r;
                                    clickedCol = c;
                                    break;
                                }
                            }
                            if (clickedRow != -1) {
                                break;
                            }
                        }
                        // Check if there was a previous button clicked
                        if (lastClickedRow != -1 && lastClickedCol != -1) {
                            // Calculate the difference in rows and columns
                            int rowDiff = Math.abs(clickedRow - lastClickedRow);
                            int colDiff = Math.abs(clickedCol - lastClickedCol);

                            // Check if the clicked buttons are adjacent (horizontally or vertically)
                            if ((rowDiff == 1 && colDiff == 0) || (rowDiff == 0 && colDiff == 1)) {
                                // Swap the text and background color
                                swapButtons(lastClickedRow, lastClickedCol, clickedRow, clickedCol);

                                // Check for matches of length 3 in horizontal and vertical directions
                                if (checkMatch()) {
                                    // Handle the match as required (e.g., removing matched buttons)
//                                    handleMatch();
                                } else {
                                    // Revert the swap if no match is found
                                    swapButtons(lastClickedRow, lastClickedCol, clickedRow, clickedCol);
                                }
                            }

                            // Reset the last clicked button tracking
                            lastClickedRow = -1;
                            lastClickedCol = -1;
                        } else {
                            // Store the clicked button's position
                            lastClickedRow = clickedRow;
                            lastClickedCol = clickedCol;
                        }
                    }


                });
            }
        }
        while(checkMatch()){
            setGame();
        }
        resultTV.setText("Score: "+score);
    }

    private void swapButtons(int row1, int col1, int row2, int col2) {
        // Swap text
        CharSequence tempText = buttons[row1][col1].getText();
        buttons[row1][col1].setText(buttons[row2][col2].getText());
        buttons[row2][col2].setText(tempText);

        // Swap background colors
//        int tempColor = (Integer.parseInt(buttons[row1][col1].getText().toString()));
        buttons[row1][col1].setBackgroundColor(colors[Integer.parseInt(buttons[row1][col1].getText().toString())]);
        buttons[row2][col2].setBackgroundColor(colors[Integer.parseInt(buttons[row2][col2].getText().toString())]);

        while(checkMatch()){
            score++;
            resultTV.setText(String.format("Score: %d", score));
        }
    }


    @SuppressLint("SetTextI18n")
    private void setGame(){
        for(int row =0;row<5;row++){
            for(int col = 0;col<5;col++){
                int index = generateRandom();
                buttons[row][col].setBackgroundColor(colors[index]);
                buttons[row][col].setText(Integer.toString(index));
                buttons[row][col].setTextSize(20);
            }
        }
    }

    private int generateRandom(){
        int index = new Random().nextInt(3);
        return index;
    }

    @SuppressLint("SetTextI18n")
    private void randomizeButtons(int row, int col){
        int index = generateRandom();

        buttons[row][col].setBackgroundColor(colors[index]);
        buttons[row][col].setText(Integer.toString(index));
        buttons[row][col].setTextSize(20);

    }

    @SuppressLint("SetTextI18n")
    private Boolean checkMatch(){
        // Define the number of rows and columns in the buttons array
        int numRows = buttons.length;
        int numCols = buttons[0].length;

        // Iterate through each button in the 2D array
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                // Horizontal
                if (col <= numCols - 3) {
                    if (buttons[row][col].getText().toString().equals(buttons[row][col + 1].getText().toString()) &&
                            buttons[row][col].getText().toString().equals(buttons[row][col + 2].getText().toString())) {
                        randomizeButtons(row,col);
                        return true;
                    }
                }

                // Vertical
                if (row <= numRows - 3) {
                    if (buttons[row][col].getText().toString().equals(buttons[row + 1][col].getText().toString()) &&
                            buttons[row][col].getText().toString().equals(buttons[row + 2][col].getText().toString())) {
                        randomizeButtons(row,col);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}