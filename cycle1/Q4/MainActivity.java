package com.example.q4_demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,em;
    RadioGroup rg;
    RadioButton male,female;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        em=findViewById(R.id.em);
        rg=findViewById(R.id.rg);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        btn=findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validate()){
                    String n=name.getText().toString();
                    String e=em.getText().toString();
                    String gen=male.isChecked()?"male":"female";

                    String msg = "Name: "+ n +"\nEmail: "+e+"\nGender:"+gen;

                    Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    private boolean validate(){
        boolean isvalid=true;
        String na = name.getText().toString();
        String e = em.getText().toString();

        if(na.isEmpty()){
            name.setError("Enter name");
            isvalid=false;
        }

        if(e.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(e).matches())
        {
            em.setError("Invalid email");
            isvalid=false;
        }

        return isvalid;
    }


}