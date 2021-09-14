//By Rohith  D'souza
package com.sem6.mad.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText num1;
    EditText num2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    TextView ans;

    long n1,n2;
    String val="";

    public  void onClick(View v)
    {

        switch(v.getId()) {
            case R.id.btnAdd :
                n1 = Integer.parseInt(num1.getText().toString());
                n2= Integer.parseInt(num2.getText().toString());
                val = (n1 + " + "+ n2 + " = " + (n1+n2));
                ans.setText(val);
                break;
            case R.id.btnSub :
                n1 = Integer.parseInt(num1.getText().toString());
                n2= Integer.parseInt(num2.getText().toString());
                val = (n1 + " - "+ n2 + " = " + (n1-n2));
                ans.setText(val);
                break;

            case R.id.btnMul :
                n1 = Integer.parseInt(num1.getText().toString());
                n2= Integer.parseInt(num2.getText().toString());
                val = (n1 + " * "+ n2 + " = " + (n1*n2));
                ans.setText(val);
                break;
            case R.id.btnDiv :
                n1 = Integer.parseInt(num1.getText().toString());
                n2= Integer.parseInt(num2.getText().toString());
                val = (n1 + " / "+ n2 + " = " + (n1/n2));
                ans.setText(val);
                break;


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
        ans = findViewById(R.id.txtAnswer);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);


    }
}