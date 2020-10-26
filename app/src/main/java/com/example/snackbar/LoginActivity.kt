package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snackbar.domain.Usuario
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            login(validaLogin())
        }

        btnCadastro.setOnClickListener{
            iniciaCadastro()
        }

    }

    fun validaLogin(): Usuario{
        var username = edUserName.text.toString()
        var password = edUserName.text.toString()

         return Usuario(1, username, password)
    }


    fun login(usuario: Usuario){
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("1", usuario)
        startActivity(intent)
    }

    fun iniciaCadastro(){
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

}