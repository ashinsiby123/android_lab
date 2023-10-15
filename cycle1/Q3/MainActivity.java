package com.example.q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.et1);
        ed2 = findViewById(R.id.et2);
        tv1= findViewById(R.id.tvr);
    }

        public void sum(View view){
        String a = ed1.getText().toString();
        String b = ed2.getText().toString();
        if(!a.isEmpty() && !b.isEmpty()) {
            double num1 = Double.parseDouble(a);
            double num2 = Double.parseDouble(b);
            double s = num1 + num2;
            tv1.setText(String.valueOf(s));
        }
        else {
            tv1.setText("enter numbers");
        }
        }
}