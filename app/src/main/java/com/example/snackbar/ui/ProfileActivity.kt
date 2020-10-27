package com.example.snackbar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.snackbar.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbar_profile)
        toolbar_profile.setNavigationOnClickListener { finish() }


        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            val nome = bundle.getString("Nome")
            val peso = bundle.getDouble("Peso")
            val idade = bundle.getInt("Idade")
            val titular = bundle.getBoolean("Titular")

            Toast.makeText(this, bundle.toString(), Toast.LENGTH_SHORT).show()

         }
        }
}