package com.vaibhavrawat.implicitintentproject

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder.DeathRecipient
import android.widget.Button
import android.widget.EditText
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    var btnWeb : Button ?= null
    var btnSMS : Button ?= null
    var btnCall : Button ?= null
    //var etPhoneNumber : EditText ?= null
    var phoneNumber = "0000000000"
    //var link : String ?= ""
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWeb = findViewById(R.id.btnWeb)
        btnSMS = findViewById(R.id.btnSMS)
        btnCall = findViewById(R.id.btnCall)
        //etPhoneNumber = findViewById(R.id.etPhonenUmber)
        btnWeb?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://google.com")
            startActivity(intent)
        }
        btnSMS?.setOnClickListener {
           // phoneNumberFromUser= etPhoneNumber.toString()
           val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("sms:$phoneNumber")
                startActivity(intent)
        }
        btnCall?.setOnClickListener {
            //phoneNumberFromUser= etPhoneNumber.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }
    }
}