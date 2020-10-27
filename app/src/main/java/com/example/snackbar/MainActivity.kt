package com.example.snackbar

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.snackbar.`interface`.ContractMainActivity
import com.example.snackbar.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContractMainActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)
        toolbar_main.setNavigationOnClickListener { finish() }

        toolbar_main.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.account ->{
                    val intent = Intent(this, ProfileActivity::class.java)

                    val info = Bundle()
                    info.putString("Nome", "Nome")
                    info.putInt("Idade", 18)
                    info.putDouble("Peso", 50.0)
                    info.putBoolean("Titular", true)

                    startActivity(intent)
                    true
                }
                else -> false
            }
        }


        // var usuario: Usuario? = intent.getSerializableExtra("1") as? Usuario
        //Toast.makeText(this, "Olá ${usuario?.username}", Toast.LENGTH_SHORT).show()


        val fragment = HomeFragment.newInstance()
        btn_home.setTextColor(getColor(R.color.colordetail))
        linha_home.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))
        home_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))


        supportFragmentManager.beginTransaction().apply {
            add(R.id.flFragment, fragment)
            commit()
        }

        btn_home.setOnClickListener {

            btn_home.setTextColor(getColor(R.color.colordetail))
            linha_home.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))
            home_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))

            btn_entradas.setTextColor(getColor(R.color.colorWhite))
            linha_entradas.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))
            entradas_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))

            btn_gastos.setTextColor(getColor(R.color.colorWhite))
            linha_gastos.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))
            money_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment)
                addToBackStack(null)
                commit()
            }
        }

        val fragment2 = GastosFragment.newInstance()

        btn_gastos.setOnClickListener {

            btn_gastos.setTextColor(getColor(R.color.colordetail))
            linha_gastos.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))
            money_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))

            btn_home.setTextColor(getColor(R.color.colorWhite))
            linha_home.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))
            home_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))

            btn_entradas.setTextColor(getColor(R.color.colorWhite))
            linha_entradas.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))
            entradas_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment2)
                addToBackStack(null)
                commit()
            }
        }

        val fragment3 = EntradasFragment.newInstance()

        btn_entradas.setOnClickListener {

            btn_entradas.setTextColor(getColor(R.color.colordetail))
            linha_entradas.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))
            entradas_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colordetail)))

            btn_home.setTextColor(getColor(R.color.colorWhite))
            linha_home.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))
            home_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))

            btn_gastos.setTextColor(getColor(R.color.colorWhite))
            linha_gastos.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))
            money_color.setImageTintList(ColorStateList.valueOf(resources.getColor(R.color.colorWhite)))

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment3)
                addToBackStack(null)
                commit()
            }
        }

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_main, menu)
        return true
    }


    override fun callFragDetail() {
        val fragment4 = DetailGastosFragment.newInstance("Detalhes Gasto")
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment2, fragment4)
            addToBackStack(null)
            commit()
        }
    }


}
