package com.example.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRst;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRst = (Button) findViewById(R.id.BtnRst);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    result = Float.parseFloat(num1)+Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    result = Float.parseFloat(num1)-Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + String.format("%.6f", result));
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    result = Float.parseFloat(num1)*Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + String.format("%.5f", result));
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (num2.equals("0")) {
                    Toast.makeText(MainActivity.this, "0을 제외한 숫자로 나누세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    result = Float.parseFloat(num1)/Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + String.format("%.5f", result));
                }
            }
        });
        btnRst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (num2.equals("0")) {
                    Toast.makeText(MainActivity.this, "0을 제외한 숫자로 나누세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    result = Float.parseFloat(num1)%Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + String.format("%.5f", result));
                }
            }
        });
    }
}