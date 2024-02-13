package com.example.splitgo

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.TextView

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val textViewLogIn = findViewById<TextView>(R.id.appName)
        val appName = "SplitGo"

        val ss = SpannableString(appName)
        val fColor1 = ForegroundColorSpan(Color.BLUE)
        val fColor2 = ForegroundColorSpan(Color.rgb(235, 219, 0))

        ss.setSpan(fColor1, 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(fColor2, 5, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        textViewLogIn.setText(ss)

        val msg = findViewById<TextView>(R.id.message)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            msg.text="Uspjesna prijava"
        }
    }

    fun registrationScreen(view: View){
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
    }
}