package com.example.responsi013

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.*

class ActivityPreview : AppCompatActivity() {

    lateinit var inamalengkap : TextView
    lateinit var inamapanggilan : TextView
    lateinit var ialamat : TextView
    lateinit var ihobi : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        inamalengkap = findViewById(R.id.h_namalengkap)
        inamapanggilan = findViewById(R.id.h_namapanggilan)
        ialamat = findViewById(R.id.h_alamat)
        ihobi = findViewById(R.id.h_hobi)



        inamalengkap.setText(intent.getStringExtra("datanamal"))
        inamapanggilan.setText(intent.getStringExtra("datanamap"))
        ialamat.setText(intent.getStringExtra("dataalamat"))
        ihobi.setText(intent.getStringExtra("datahobi"))

        btn_back.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
        btn_login.setOnClickListener() {
            val intent = Intent(this, ActivityLogin::class.java)

            startActivity(intent)
        }
    }
}
