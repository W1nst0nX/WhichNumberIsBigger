package com.example.whichnumberisbigger

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private var firstNumber = 0
private var secondNumber = 0
private var score = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start()
    }

    fun onClickLeft(view: View) {
        if(firstNumber > secondNumber)
        {
            score++
            Toast.makeText(this, "Congrats, it's right!", Toast.LENGTH_SHORT).show()
            start()
        }
        else
        {
            score--
            Toast.makeText(this, "Wow, how can you be so bad?", Toast.LENGTH_SHORT).show()
            start()
        }
    }

    fun onClickRight(view: View) {
        if(firstNumber < secondNumber)
        {
            score++
            Toast.makeText(this, "Congrats, it's right!", Toast.LENGTH_SHORT).show()
            start()
        }
        else
        {
            score--
            Toast.makeText(this, "Wow, how can you be so bad?", Toast.LENGTH_SHORT).show()
            start()
        }
    }

    fun start() {
        firstNumber = (Math.random() * 100).toInt()
        secondNumber = (Math.random() * 100).toInt()
        while(firstNumber == secondNumber)
        {
            secondNumber = (Math.random() * 100).toInt()
        }
        textView_main_score.text = score.toString()
        button_main_left.text = firstNumber.toString()
        button_main_right.text = secondNumber.toString()
    }
}