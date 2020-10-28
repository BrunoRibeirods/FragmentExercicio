package com.example.snackbar.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.example.snackbar.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.profile_body.*

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbar_profile)
        toolbar_profile.setNavigationOnClickListener { finish() }


        val bundle: Bundle? = intent.extras
        val bundleB = bundle?.getBundle("bundle")
        if(bundle != null){
            val nome = bundleB?.getString("Nome")
            val peso = bundleB?.getDouble("Peso")
            val idade = bundleB?.getInt("Idade")
            val titular = bundleB?.getBoolean("Titular")

            Toast.makeText(this, bundle.toString(), Toast.LENGTH_SHORT).show()

            nome_profile.text = nome.toString()
            idade_profile.text = "${idade.toString()} Anos"

         }


        }

}
