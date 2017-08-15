package com.edorin.kotlindemo.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.edorin.kotlindemo.R
import com.edorin.kotlindemo.java.SummaryActivity
import com.edorin.kotlindemo.selectedItemString
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    val title = "University of Assumption"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set title text
        txvTitle.text = title

        // click listener
        btnSubmit.setOnClickListener {
            startActivity<SummaryActivity>(
                    "firstname" to edtFirstname.text,
                    "lastname" to edtLastname.text,
                    "gender" to spnGender.selectedItemString())
        }
    }

}



