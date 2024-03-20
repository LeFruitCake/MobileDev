package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Stack;

public class Calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDivide,btnAdd,btnSubtract,btnMultiply,btnEquals,btnDot;
    TextView equationTV, resultTV;
    boolean dotted = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEquals = findViewById(R.id.btnEquals);
        btnDot = findViewById(R.id.btnDot);
        equationTV = findViewById(R.id.equationTV);
        resultTV = findViewById(R.id.resultTV);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }
                equationTV.setText(equationTV.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }equationTV.setText(equationTV.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!dotted){
                    equationTV.setText(equationTV.getText()+".");
                    dotted = true;
                }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }
                dotted = false;
                if(equationTV.length() != 0){
                    if (isNumeric(equationTV.getText().charAt(equationTV.length()-1))){
                        equationTV.setText(equationTV.getText()+"+");
                    } else if (!isNumeric(equationTV.getText().charAt(equationTV.length()-1)) && equationTV.getText().charAt(equationTV.length()-1) != '+') {
                        equationTV.setText(equationTV.getText().toString().substring(0,equationTV.length()-1)+"+");
                    }else{
                        evaluate(equationTV.getText().toString());
                    }
                }
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }
                dotted = false;
                if(equationTV.length() != 0){
                    if (isNumeric(equationTV.getText().charAt(equationTV.length()-1))){
                        equationTV.setText(equationTV.getText()+"-");
                    } else if (!isNumeric(equationTV.getText().charAt(equationTV.length()-1)) && equationTV.getText().charAt(equationTV.length()-1) != '-') {
                        equationTV.setText(equationTV.getText().toString().substring(0,equationTV.length()-1)+"-");
                    }else{
                        evaluate(equationTV.getText().toString());
                    }
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }
                dotted = false;
                if(equationTV.length() != 0){
                    if (isNumeric(equationTV.getText().charAt(equationTV.length()-1))){
                        equationTV.setText(equationTV.getText()+"*");
                    } else if (!isNumeric(equationTV.getText().charAt(equationTV.length()-1)) && equationTV.getText().charAt(equationTV.length()-1) != '*') {
                        equationTV.setText(equationTV.getText().toString().substring(0,equationTV.length()-1)+"*");
                    }else{
                        evaluate(equationTV.getText().toString());
                    }
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!resultTV.getText().toString().isEmpty()){
                    resultTV.setText("");
                }
                dotted = false;
                if(equationTV.length() != 0){
                    if (isNumeric(equationTV.getText().charAt(equationTV.length()-1))){
                        equationTV.setText(equationTV.getText()+"/");
                    } else if (!isNumeric(equationTV.getText().charAt(equationTV.length()-1)) && equationTV.getText().charAt(equationTV.length()-1) != '/') {
                        equationTV.setText(equationTV.getText().toString().substring(0,equationTV.length()-1)+"/");
                    }else{
                        evaluate(equationTV.getText().toString());
                    }
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortEquation(equationTV.getText().toString());
            }
        });

    }
    @SuppressLint("SetTextI18n")
    private void evaluate(String equation){
        StringBuilder operand1 = new StringBuilder();
        StringBuilder operand2 = new StringBuilder();
        char operator = 0;
        float res;
        if(resultTV.getText().toString().isEmpty()){
            res = 0;
        }else{
            res = Float.parseFloat(resultTV.getText().toString());
        }
        System.out.println("Fresh Load res = "+res);
//        if(!isNumeric(equation.charAt(equation.length()-1))){
//            equation = equation.substring(0,equation.length()-1);
//        }
        char[] foo = equation.toCharArray();
        System.out.println("equation: "+equation+" equation len: "+equation.length()+" foo len: "+foo.length);
        for(int i = 0; i <foo.length;i++){
            if(isNumeric(foo[i])){
                if (operator == 0){
                    operand1.append(foo[i]);
                }else{
                    operand2.append(foo[i]);
                }
            }else{
                if(operator == 0){
                    operator = foo[i];
                }else{
                    if(res == 0){
                        System.out.println("Operand1: "+operand1+" "+operator+" Operand2: "+operand2);
                        res = calculate(Float.parseFloat(String.valueOf(operand1)),Float.parseFloat(String.valueOf(operand2)),operator);
                        operator = 0;
                        operand2.delete(0,operand2.length());
                    }else{
                        System.out.println("Res: "+res+" "+operator+" Operand2: "+operand2);
                        res = calculate(res,Float.parseFloat(String.valueOf(operand2)),operator);
                        operator = 0;
                        operand2.delete(0,operand2.length());
                    }
                    operator = foo[i];
                }
            }
        }
//        res = calculate(Float.parseFloat(String.valueOf(operand1)),Float.parseFloat(String.valueOf(operand2)),operator);
//        System.out.println("Op1: "+operand1+""+operator+"Op2: "+operand2);
        resultTV.setText(String.valueOf(res));
    }

    private float calculate(float num1, float num2, Character operator){
        switch (operator){
            case '+':
                float val = num1 + num2;
                System.out.println("I returned: "+val);
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            default:
                System.out.println("I returned: 0 as default");
                return 0;
        }
    }

    private boolean isNumeric(char foo){
        switch(foo){
            case '+':
            case '-':
            case '*':
            case '/':
            case '(':
            case ')':
                return false;
            default:
                return true;
        }
    }

    private void sortEquation(String equation){
        StringBuilder op1 = new StringBuilder();
        StringBuilder op2 = new StringBuilder();
        float res;
        if(!isNumeric(equation.charAt(equation.length()-1))){
            equation = equation.substring(0,equation.length()-1);
        }
        ArrayList<Character> foo = new ArrayList<Character>();
        for (Character character : equation.toCharArray()) {
            foo.add(character);
        }
        System.out.println(foo);


    }

}