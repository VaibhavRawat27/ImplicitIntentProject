package com.vaibhavrawat.implicitintentproject

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder.DeathRecipient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var btnWeb : Button ?= null
    var btnSMS : Button ?= null
    var etWeb : EditText ?= null
    //var link : String ?= ""
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWeb = findViewById(R.id.btnWeb)
        etWeb = findViewById(R.id.etWeb)
        btnWeb?.setOnClickListener {
            //link = etWeb.toString()
            var intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://google.com")
            startActivity(intent)
        }






        btnSMS?.setOnClickListener {
            /* val recipient = "9501676401"
            val message = "Hello"
                sendSMS(recipient, message)

            fun sendSMS(recipient: String, message: String) {
                val smsUri = Uri.parse("smsto : $recipient")
                val smsIntent = Intent(Intent.ACTION_SENDTO, smsUri)
                smsIntent.putExtra("sms_body", message)
                startActivity(smsIntent)
            } */
        }
    }
    /* private fun sendSMS(recipient: String, message: String) {
        val smsUri = Uri.parse("smsto : $recipient")
        val smsIntent = Intent(Intent.ACTION_SENDTO, smsUri)
        smsIntent.putExtra("sms_body", message)
        startActivity(smsIntent)
    } */
}