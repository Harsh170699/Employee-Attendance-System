package com.example.employeemanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class sign_up extends AppCompatActivity {

    private Button mFirebasebtn;
    private DatabaseReference mDatabase;

    private EditText mNameField;
    private EditText mEmailField;
    private EditText mpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mFirebasebtn = (Button) findViewById(R.id.firebase_btn);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("User 01");

        mNameField = (EditText) findViewById(R.id.name_field);
        mEmailField = (EditText) findViewById(R.id.email_field);
        mpassword = (EditText) findViewById(R.id.passwordfield);

        mFirebasebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString().trim();
                String email = mEmailField.getText().toString().trim();

                HashMap dataMap = new HashMap();
                dataMap.put("Name",name);
                dataMap.put("Email id",email);

                //added by bhomik 21-02-2019
                Intent intent = new Intent(sign_up.this,view_attendance.class);
                startActivity(intent);
                mDatabase.push().setValue(dataMap);
            }
        });
    }
}
