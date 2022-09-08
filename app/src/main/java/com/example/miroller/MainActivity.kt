package com.example.miroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etq: TextView
    lateinit var boton: Button
    lateinit var img: ImageView
    lateinit var img2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roller)

        boton = findViewById(R.id.btnClickHere)
        etq = findViewById(R.id.lblroller)
        img = findViewById(R.id.imgRoller)
        img2 = findViewById(R.id.imgRoller2)

        img.setImageResource(R.drawable.empty_dice)
        img2.setImageResource(R.drawable.empty_dice)


        boton.setOnClickListener{
            Toast.makeText(applicationContext, "Boton Presionado", Toast.LENGTH_LONG).show()

            img.setImageResource(getRandomDiceImage())

            img2.setImageResource(getRandomDiceImage())

            etq.text="Aleatorios:"




        }
    }

    fun diceRoller(par: Int = 0): Int{
        return (1..6).random()
    }

    private fun getRandomDiceImage() : Int{
        val aleatorio = diceRoller()

        val res = when(aleatorio){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return res
    }
}