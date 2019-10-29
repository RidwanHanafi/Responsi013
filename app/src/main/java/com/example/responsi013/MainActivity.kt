package com.example.responsi013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var inamalengkap: EditText
    lateinit var inamapanggilan: EditText
    lateinit var ialamat: EditText
    lateinit var ihobi: EditText
    lateinit var iklikregistrasi: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inamalengkap = findViewById(R.id.h_namalengkap)
        inamapanggilan = findViewById(R.id.namapanggilan)
        ialamat = findViewById(R.id.alamat)
        ihobi = findViewById(R.id.hobi)
        iklikregistrasi = findViewById(R.id.btn_registrasi)

        //Mengirim data
        btn_registrasi.setOnClickListener() {

            val intent = Intent(this, ActivityPreview::class.java)

            intent.putExtra("datanamal", inamalengkap.text.toString())
            intent.putExtra("datanamap", inamapanggilan.text.toString())
            intent.putExtra("dataalamat", ialamat.text.toString())
            intent.putExtra("datahobi", ihobi.text.toString())

            startActivity(intent)

        }

    }

}
