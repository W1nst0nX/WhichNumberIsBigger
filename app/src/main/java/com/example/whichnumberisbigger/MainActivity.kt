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
        game.leftNumber
        game.rightNumber
        game.score
        game.checkAnswer(button_main_left.text.toString().toInt())
    }
}