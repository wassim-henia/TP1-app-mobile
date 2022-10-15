package com.example.tp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txtEmail : EditText
    lateinit var txtPass : EditText
    lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtEmail = findViewById(R.id.editTextEmail)
        txtPass = findViewById(R.id.editTextPass)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener { view ->
            val email = txtEmail.text.toString()
            val pass = txtPass.text.toString()
            if(email=="gl4@insat.tn" && pass=="insat2022"){
                Toast.makeText(this@MainActivity, "Bienvenue", Toast.LENGTH_LONG).show()
                val intent = Intent(view.context,WelcomeActivity::class.java)
                intent.putExtra("email",email)
                startActivity(intent)


            }else{
                Toast.makeText(this@MainActivity, "Email ou  mot de \n passe incorrectes", Toast.LENGTH_LONG).show()
            }



        }
    }


}