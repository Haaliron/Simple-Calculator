package com.haliron.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editNumber1;
    EditText editNumber2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber1 = findViewById(R.id.editNumber1);
        editNumber2 = findViewById(R.id.editNumber2);
        resultText = findViewById(R.id.resultText);
    }

    public void plus(View view){
        if(editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")){
            resultText.setText("Enter Number ! ");
        }else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result : " + result);
        }
    }

    public void negative(View view){
        if(editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")){
            resultText.setText("Enter Number ! ");
        }else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result : " + result);
        }
    }

    public void multiplication(View view){
        if(editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")){
            resultText.setText("Enter Number ! ");
        }else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result : " + result);
        }
    }

    public void split(View view){
        if(editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")){
            resultText.setText("Enter Number ! ");
        }else {
            int number1 = Integer.parseInt(editNumber1.getText().toString());
            int number2 = Integer.parseInt(editNumber2.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result : " + result);
        }
    }

}