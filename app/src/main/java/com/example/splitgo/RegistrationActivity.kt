package com.example.splitgo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val textViewLogIn = findViewById<TextView>(R.id.appName)
        val appName = "SplitGo"

        val ss = SpannableString(appName)
        val fColor1 = ForegroundColorSpan(Color.BLUE)
        val fColor2 = ForegroundColorSpan(Color.rgb(235, 219, 0))

        ss.setSpan(fColor1, 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(fColor2, 5, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        textViewLogIn.setText(ss)
    }
}