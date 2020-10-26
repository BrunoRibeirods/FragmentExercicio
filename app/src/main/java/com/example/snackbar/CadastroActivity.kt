package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.cadastro_body.*
import kotlinx.android.synthetic.main.cadastro_body.edPassword
import kotlinx.android.synthetic.main.login_body.*


class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow)
        toolbar.setNavigationOnClickListener { finish() }

        btnEnviaCadastro.setOnClickListener {
            validarSenha(it)
        }

    }


    fun validarSenha(view: View){
        val password = edPassword.text.toString()
        val confirmation = edPasswordConfirmation.text.toString()

        if (password != confirmation) {
            edPasswordConfirmation.error = "Senhas não conferem."
        }else{
            Snackbar.make(view, "Cadastro completo!", Snackbar.LENGTH_LONG)
                .setAction("Continuar") {
                    finish()
                }
                .show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater

        inflate.inflate(R.menu.toolbar, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.btn_info -> {
                Toast.makeText(this, "Informações", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}
