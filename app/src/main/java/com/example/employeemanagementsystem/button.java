package com.example.employeemanagementsystem;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class button extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);

        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();

        if(i==R.id.btn1)
        {
            Toast.makeText(this,"Sign up",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(button.this,sign_up.class);
            startActivity(intent);

            finish();
        }

        if(i==R.id.btn2)
        {
            Toast.makeText(this,"Log In",Toast.LENGTH_LONG).show();
            Intent in = new Intent(button.this,MainActivity.class);
            startActivity(in);

            finish();
        }


    }
}