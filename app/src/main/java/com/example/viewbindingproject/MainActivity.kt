package com.example.viewbindingproject

//NIM : 10122908
//Nama : Nizar Ihza Zulkarnain
//Kelas : IF13
//Last Modified : 14/05/2025

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.example.viewbindingproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    /*
    private lateinit var edtValueNim: EditText
    private lateinit var edtValueNama: EditText
    private lateinit var btnValueSimpan: Button
    private lateinit var txtValueNim: TextView
    private lateinit var txtValueNama: TextView
    */

    private lateinit var binding: ActivityMainBinding

    var nim: String = ""
    var nama: String = ""

    var mahasiswa: Mahasiswa = Mahasiswa()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSimpan.setOnClickListener {

            mahasiswa.nim = binding.edtNim.text.toString()
            mahasiswa.nama  = binding.edtNama.text.toString()

            var m1 = Mahasiswa()
            binding.mahasiswa = mahasiswa


//            binding.txtNim.text = "NIM :"+ nim
//            binding.txtNama.text = "Nama Anda :"+nama

            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
        }


         /*
        setContentView(R.layout.activity_main)
        edtValueNim = findViewById (R.id.edt_nim)
        edtValueNama = findViewById(R.id.edt_nama)
        btnValueSimpan = findViewById(R.id.btn_simpan)
        txtValueNim = findViewById(R.id.txt_nim)
        txtValueNama = findViewById(R.id.txt_nama)

        btnValueSimpan.setOnClickListener{

        }
        */


    }
}

