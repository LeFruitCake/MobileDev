package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.Stack;

public class Calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDivide,btnAdd,btnSubtract,btnMultiply,btnEquals,btnDot,btnBackSpace,btnClear;
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
        btnBackSpace = findViewById(R.id.btnBksp);
        btnClear = findViewById(R.id.btnC3);
        dotted = false;
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
                        evaluate();
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
                        evaluate();
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
                        evaluate();
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
                        evaluate();
                    }
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluateBODMAS();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.setText("");
                equationTV.setText("");
            }
        });

        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString().substring(0,equationTV.length()-1));
            }
        });

    }


    private void evaluate(){
        String equation = equationTV.getText().toString();
        Stack<Object> foo = new Stack<>();
        if(!isNumeric(equation.charAt(equation.length()-1))){
            equation = equation.substring(0,equation.length()-1);
        }
        for(int i = 0; i<equation.length();i++){
            if(foo.isEmpty()){
                foo.push(equation.charAt(i));
            }else if(foo.peek() instanceof Character){
                System.out.println("YESSSSSSSS"+foo.peek());
                if(isNumeric((Character) foo.peek())){
                    System.out.println("I will push "+foo.peek());
                    foo.push(equation.charAt(i));
                }else{
                    StringBuilder num1 = new StringBuilder();
                    StringBuilder num2 = new StringBuilder();
                    char operator = (char) foo.pop();
                    if(foo.peek() instanceof Float){
                        num1.append(foo.pop());
                    }else{
                        while(!foo.isEmpty()){
                            num1.append(foo.pop());
                        }
                        num1.reverse();
                    }
                    for(int j = i;j<equation.length();j++){
                        if(isNumeric(equation.charAt(j))){
                            num2.append(equation.charAt(j));
                            i++;
                        }else{
                            i--;
                            break;
                        }
                    }
                    foo.push(calculateSequentially(operator,Float.parseFloat(String.valueOf(num1)),Float.parseFloat(String.valueOf(num2))));
                    System.out.println("I pushed "+foo.peek()+" into the stack");
                }
            }else{
                foo.push(equation.charAt(i));
            }
        }
        StringBuffer res = new StringBuffer();
        while(!foo.isEmpty()){
            res.append(foo.pop());
        }
        resultTV.setText(res);
        res.setLength(0);
        foo.clear();
    }

    private float calculateSequentially(Character operator, float num1, float num2){
        switch (operator){
            case '+':
                float val = num1 + num2;
                System.out.println("Sum of "+num1+" and "+num2+": "+(num1+num2));
                return num1+num2;
            case '-':
                System.out.println("Difference of "+num1+" and "+num2+": "+(num1-num2));
                return num1-num2;
            case '*':
                System.out.println("Product of "+num1+" and "+num2+": "+(num1*num2));
                return num1*num2;
            case '/':
                System.out.println("Quotient of "+num1+" and "+num2+": "+(num1/num2));
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

    private void evaluateBODMAS(){
        String equation = equationTV.getText().toString();
        Stack<Object> foo = new Stack<>();
        StringBuilder sb = new StringBuilder();
        //Convert to postfix expression
        for(int i = 0;i<equation.length();i++){
            if(!isNumeric(equation.charAt(i))){
                if(foo.isEmpty()){
                    System.out.println("I will push "+equation.charAt(i)+" because stack is empty");
                    foo.push(equation.charAt(i));
                } else if (getPrescedence((Character) foo.peek()) >= getPrescedence(equation.charAt(i))) {
                    while(!foo.isEmpty() && getPrescedence((Character) foo.peek()) >= getPrescedence(equation.charAt(i))){
                        System.out.println("I will pop "+equation.charAt(i) +" because of prescedence");
                        sb.append(foo.pop());
                    }
                    System.out.println("I will push "+ equation.charAt(i) + " after popping due to prescedence");
                    foo.push(equation.charAt(i));
                }else{
                    foo.push(equation.charAt(i));
                }
            }else{
                System.out.println("I will append "+equation.charAt(i));
                sb.append(equation.charAt(i));
            }
        }

        while(!foo.isEmpty()){
            sb.append(foo.pop());
        }
        System.out.println("Postfix Expression: "+sb);

        //Evaluate the postfix expression sb
        for(int i=0;i<sb.length();i++){
            if(i!=sb.length()-1){
                if(isNumeric(sb.charAt(i))){
                    //if numeric then push
                    System.out.println("I will push "+sb.charAt(i)+" because its numeric");
                    foo.push(sb.charAt(i));
                }else{
                    StringBuilder num1 = new StringBuilder();
                    StringBuilder num2 = new StringBuilder();
                    System.out.println("I will pop "+foo.peek()+" because im performing a calculation");
                    num2.append(foo.pop());
                    System.out.println("I will pop "+foo.peek()+" because im performing a calculation");
                    num1.append(foo.pop());
                    foo.push(calculateSequentially(sb.charAt(i),Float.parseFloat(String.valueOf(num1)),Float.parseFloat(String.valueOf(num2))));
                }
            }else{
                StringBuilder num1 = new StringBuilder();
                StringBuilder num2 = new StringBuilder();
                System.out.println("I will pop "+foo.peek()+" because im performing a calculation");
                num2.append(foo.pop());
                if(foo.size()>1){
                    while(!foo.isEmpty()){
                        if((foo.peek() instanceof Float)){
                            float myF = (Float) foo.pop();
                            int temp = (int) myF;
                            foo.push(temp);
                        }
                        System.out.println("I will pop "+foo.peek()+" because im performing a calculation");
                        num1.append(foo.pop());
                        num1.reverse();
                        System.out.println("Reversed num1 "+num1);
                    }
                }else{
                    num1.append(foo.pop());
                }

                resultTV.setText(String.valueOf(calculateSequentially(sb.charAt(i),Float.parseFloat(String.valueOf(num1)),Float.parseFloat(String.valueOf(num2)))));
            }
        }


//        resultTV.setText(sb.toString());

    }

    private int getPrescedence(char c){
        switch (c){
            case '/':
            case '*':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    // Function to return precedence of operators


}