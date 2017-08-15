package com.edorin.kotlindemo.kotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.edorin.kotlindemo.R
import com.edorin.kotlindemo.stringExtra
import kotlinx.android.synthetic.main.activity_summary.*

class SummaryActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        // get string extras
        val firstname = "firstname".stringExtra(this)
        val lastname = "lastname".stringExtra(this)
        val gender = "gender".stringExtra(this)

        // set texts
        txvName.text = "$lastname, $firstname"
        txvGender.text = gender
    }

}