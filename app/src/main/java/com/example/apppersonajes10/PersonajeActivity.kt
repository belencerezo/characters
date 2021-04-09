package com.example.apppersonajes10

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apppersonajes10.databinding.ActivityMainBinding
import com.example.apppersonajes10.databinding.ActivityPersonajeBinding

class PersonajeActivity: AppCompatActivity() {

    lateinit var binding: ActivityPersonajeBinding


    companion object {
        const val VALOR1 = "VALOR1"
        const val VALOR2 = "VALOR2"
        const val VALOR3 = "VALOR3"
        const val VALOR4 = "VALOR4"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(VALOR1)
        binding.namePrincipal.text = name

        val raza = intent.getStringExtra(VALOR2)
        binding.razaPrincipal.text = raza

        val foto = intent.getIntExtra(VALOR3, R.mipmap.ic_launcher)
        binding.fotoPrincipal.setImageResource(foto)

        val esBueno = intent.getBooleanExtra(VALOR4, false)



    }


}