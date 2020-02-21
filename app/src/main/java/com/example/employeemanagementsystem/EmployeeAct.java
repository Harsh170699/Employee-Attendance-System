package com.example.employeemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.awt.font.TextAttribute;

public class EmployeeAct extends AppCompatActivity {

    private TextView tvtitle;
    private ImageView img;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        tvtitle = (TextView)findViewById(R.id.txttitle);
        img = (ImageView)findViewById(R.id.empthumbnail);

        Toast.makeText(this,"Add Attendance",Toast.LENGTH_LONG).show();

        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        int image = intent.getExtras().getInt("Thumbnail");

        startActivity(new Intent(EmployeeAct.this, Add_Attendance.class));

        tvtitle.setText(title);
        img.setImageResource(image);
    }
}
