package com.example.whichnumberisbigger

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var game = BiggerNumberGame(0, 100)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        game.genNumbers()
        updateButtons()
    }

    fun updateButtons() {
        button_main_left.text = leftNumber.toString()
        button_main_right.text = rightNumber.toString()
    }

    fun onClickLeft(view : View)
    {
        Toast.makeText(this, game.checkAnswer(button_main_left.text.toString().toInt()), Toast.LENGTH_SHORT).show()
        textView_main_score.text = score.toString()
        updateButtons()
    }

    fun onClickRight(view : View)
    {
        Toast.makeText(this, game.checkAnswer(button_main_right.text.toString().toInt()), Toast.LENGTH_SHORT).show()
        textView_main_score.text = score.toString()
        updateButtons()
    }
}