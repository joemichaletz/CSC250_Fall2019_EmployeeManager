package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity {

    private ListView employeeLV;

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        //capable of showing a collection of things on the screen
        this.employeeLV = this.findViewById(R.id.employeeLV);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Core.employeeDisplay);
        this.employeeLV.setAdapter(adapter);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}
