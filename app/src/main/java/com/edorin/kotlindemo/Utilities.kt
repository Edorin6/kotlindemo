package com.edorin.kotlindemo

import android.app.Activity
import android.widget.Spinner

/**
 * Forged by Edryn on 8/15/2017.
 */

fun Spinner.selectedItemString() : String {
    return getSelectedItem().toString()
}

fun String.stringExtra(activity: Activity) : String {
    return activity.intent.getStringExtra(this)
}