package com.edorin.kotlindemo.java;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.edorin.kotlindemo.R;

public class SummaryActivity extends AppCompatActivity {

    TextView txvName, txvGender;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // initialize widgets
        txvName = findViewById(R.id.txvName);
        txvGender = findViewById(R.id.txvGender);

        // get intent extras
        String firstname = getIntent().getStringExtra("firstname");
        String lastname = getIntent().getStringExtra("lastname");
        String gender = getIntent().getStringExtra("gender");

        // set texts
        txvName.setText(lastname + ", " + firstname);
        txvGender.setText(gender);
    }

}
