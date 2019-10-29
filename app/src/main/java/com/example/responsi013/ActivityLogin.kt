package com.example.responsi013

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity() {

    lateinit var iemail: EditText
    lateinit var ipassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        iemail = findViewById(R.id.email)
        ipassword = findViewById(R.id.password)

        //Mengirim data
        btn_login.setOnClickListener(){
            val email = email.text.toString()
            val password = password.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Tolong masukkan email dan password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(email=="admin@admin.com" && password == "admin" ) {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)

                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Ulangi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }
}
