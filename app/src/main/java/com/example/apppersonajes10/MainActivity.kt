package com.example.apppersonajes10

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.apppersonajes10.PersonajeActivity.Companion.VALOR1
import com.example.apppersonajes10.PersonajeActivity.Companion.VALOR2
import com.example.apppersonajes10.PersonajeActivity.Companion.VALOR3
import com.example.apppersonajes10.PersonajeActivity.Companion.VALOR4
import com.example.apppersonajes10.databinding.ActivityMainBinding
import com.example.apppersonajes10.databinding.ItempersonajeBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val legolas = Personaje("Legolas", "Elfo", R.mipmap.elf, true)
    val drogon = Personaje("Drogon", "Dragon", R.mipmap.dragon, true)
    val gandalf = Personaje("Gandalf", "Mago", R.mipmap.magic, true)
    val human = Personaje("Aragorn", "Humano", R.mipmap.knight, true)
    val ninja = Personaje("Ninja", "Ninja", R.mipmap.ninja, false)
    val orco = Personaje("Orco", "Orco", R.mipmap.ogre, false)

    val list = listOf(legolas, human, drogon, gandalf, ninja, orco)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillView(binding.char1, legolas)
        fillView(binding.char2, drogon)
        fillView(binding.char3, gandalf)
        fillView(binding.char4, human)
        fillView(binding.char5, ninja)
        fillView(binding.char6, orco)

    }

    private fun fillView(item: ItempersonajeBinding, personaje: Personaje) {

        val colorID = if (personaje.esBueno) R.color.colorBueno else R.color.colorMalo

        val color = ContextCompat.getColor(this, colorID )

        item.cardView2.setCardBackgroundColor(color)

        ///item.root.setBackgroundColor(color)

        item.foto.setImageResource(personaje.imageId)
        item.raza.text = personaje.raza
        item.name.text = personaje.name

        item.foto.setOnClickListener{
            val intent = Intent(this, PersonajeActivity::class.java)
            intent.putExtra(VALOR1,personaje.name)
            intent.putExtra(VALOR2,personaje.raza)
            intent.putExtra(VALOR3,personaje.imageId)

            intent.putExtra(VALOR4,personaje.esBueno)
            startActivity(intent)
        }


    }


}




