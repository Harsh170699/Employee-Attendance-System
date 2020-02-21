package com.example.employeemanagementsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EmployeeActivity extends AppCompatActivity {

    List<Employee> lstEmp;

    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main_1);

        lstEmp = new ArrayList<>();
        lstEmp.add(new Employee("Add Attendace",R.drawable.ic_launcher_background));
        lstEmp.add(new Employee("Add User",R.drawable.ic_launcher_background));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, lstEmp);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myadapter);
    }
}
