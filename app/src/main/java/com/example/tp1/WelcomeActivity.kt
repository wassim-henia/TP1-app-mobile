package com.example.tp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    lateinit var txtWelcome : TextView
    lateinit var pickImageButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        txtWelcome = findViewById(R.id.txtWelcome)
        pickImageButton = findViewById(R.id.pickImageActivityButton)

        val email = intent.getStringExtra("email")
        print(email);
        txtWelcome.text = "Bienvenue $email"

        pickImageButton.setOnClickListener { view ->
                val intent = Intent(view.context,PickImageActivity::class.java)
                intent.putExtra("email",email)
                startActivity(intent)
        }
        }

    }
