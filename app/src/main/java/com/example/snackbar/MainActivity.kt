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
                        info.putString("Nome", "Bruno")
                        info.putInt("Idade", 18)
                        info.putDouble("Peso", 50.0)
                        info.putBoolean("Titular", true)
                    intent.putExtra("bundle", info)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }


        // var usuario: Usuario? = intent.getSerializableExtra("1") as? Usuario
        //Toast.makeText(this, "Olá ${usuario?.username}", Toast.LENGTH_SHORT).show()


        val fragment = HomeFragment.newInstance()
        homeColor(R.color.colordetail)
        supportFragmentManager.beginTransaction().apply {
            add(R.id.flFragment, fragment)
            commit()
        }

        btn_home.setOnClickListener {

            homeColor(R.color.colordetail)
            entradasColor(R.color.colorWhite)
            gastosColor(R.color.colorWhite)

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment)
                addToBackStack(null)
                commit()
            }
        }

        val fragment2 = GastosFragment.newInstance()

        btn_gastos.setOnClickListener {

            homeColor(R.color.colorWhite)
            entradasColor(R.color.colorWhite)
            gastosColor(R.color.colordetail)

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment2)
                addToBackStack(null)
                commit()
            }
        }

        val fragment3 = EntradasFragment.newInstance()

        btn_entradas.setOnClickListener {

            homeColor(R.color.colorWhite)
            entradasColor(R.color.colordetail)
            gastosColor(R.color.colorWhite)

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment3)
                addToBackStack(null)
                commit()
            }
        }

    }



    fun homeColor(int: Int){
        btn_home.setTextColor(getColor(int))
        linha_home.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(int)))
        home_color.setImageTintList(ColorStateList.valueOf(resources.getColor(int)))
    }

    fun entradasColor(int: Int){
        btn_entradas.setTextColor(getColor(int))
        linha_entradas.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(int)))
        entradas_color.setImageTintList(ColorStateList.valueOf(resources.getColor(int)))
    }

    fun gastosColor(int: Int){
        btn_gastos.setTextColor(getColor(int))
        linha_gastos.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(int)))
        money_color.setImageTintList(ColorStateList.valueOf(resources.getColor(int)))
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
