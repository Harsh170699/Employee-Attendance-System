package com.example.employeemanagementsystem;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import java.lang.String;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Add_Attendance extends AppCompatActivity {

    private Button mFirebasebtn1;

    private CheckBox mch1,mch2,mch3,mch4,mch5,mch6,mch7;
    Calendar cal;   //calender
    SimpleDateFormat simpleDateFormat; //sdf = simple date format
    String Date;

    Task<Void> name;

    //Firebase Variables
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;
    private DatabaseReference mReference;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_attendance);

        mch1 = (CheckBox) findViewById(R.id.ch1);
        mch2 = (CheckBox) findViewById(R.id.ch2);
        mch3 = (CheckBox) findViewById(R.id.ch3);
        mch4 = (CheckBox) findViewById(R.id.ch4);
        mch5 = (CheckBox) findViewById(R.id.ch5);
        mch6 = (CheckBox) findViewById(R.id.ch6);
        mch7 = (CheckBox) findViewById(R.id.ch7);

        mFirebasebtn1 = (Button) findViewById(R.id.firebase_btn1);

        mFirebasebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mUid = FirebaseAuth.getInstance().getCurrentUser().getUid();
                DatabaseReference current_user_db = mDatabase.child(mUid);

                if(mch1.isChecked()){
                    name = current_user_db.child("1").setValue("Rajan Malhotra");
                    Date = simpleDateFormat.format(cal.getTime());
                }
                if(mch2.isChecked()){
                    name = current_user_db.child("2").setValue("Nisha rana");
                    Date = simpleDateFormat.format(cal.getTime());
                }
                if(mch3.isChecked()){
                    name =current_user_db.child("3").setValue("Ruchita Parmar");
                    Date = simpleDateFormat.format(cal.getTime());
                }
                if(mch4.isChecked()){
                    name = current_user_db.child("4").setValue("gaurav Patel");
                    Date = simpleDateFormat.format(cal.getTime());
                }
                if(mch5.isChecked()){
                    name = current_user_db.child("5").setValue("Purvi Patel");
                    Date = simpleDateFormat.format(cal.getTime());
                }
                if(mch6.isChecked()){
                    name = current_user_db.child("6").setValue("Dhrumil Shah");
                    Date = simpleDateFormat.format(cal.getTime());
                }
                if(mch7.isChecked()){
                    name = current_user_db.child("7").setValue("Ronak patel");
                    Date = simpleDateFormat.format(cal.getTime());
                }

                mFirebasebtn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Map dataMap = new HashMap();
                        dataMap.put("Name",name);
                        dataMap.put("Date",Date);
                    }
                });


            }

        } );
    }
}