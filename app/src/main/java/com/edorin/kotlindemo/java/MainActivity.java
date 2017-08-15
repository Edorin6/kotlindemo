package com.edorin.kotlindemo.java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.edorin.kotlindemo.R;

public class MainActivity extends AppCompatActivity {

    String title = "University Of Assumption";

    TextView txvTitle;
    EditText edtFirstname, edtLastname;
    Spinner spnGender;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize widgets
        txvTitle = findViewById(R.id.txvTitle);
        edtFirstname = findViewById(R.id.edtFirstname);
        edtLastname = findViewById(R.id.edtLastname);
        spnGender = findViewById(R.id.spnGender);
        btnSubmit = findViewById(R.id.btnSubmit);

        // set title text
        txvTitle.setText(title);

        // click listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("firstname", edtFirstname.getText());
                intent.putExtra("lastname", edtLastname.getText());
                intent.putExtra("gender", spnGender.getSelectedItem().toString());
                startActivity(intent);
            }
        });

    }

}
