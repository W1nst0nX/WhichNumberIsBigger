package com.example.whichnumberisbigger

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.coroutineContext

class BiggerNumberGame(val lowerLimit: Int, val upperLimit: Int ) {
    var leftNumber = 0
    var rightNumber = 0
    var score = 0

    //Generate random numbers
    fun genNumbers() {
        leftNumber = (Math.random() * 100).toInt()
        rightNumber = (Math.random() * 100).toInt()
        while(leftNumber == rightNumber)
        {
            rightNumber = (Math.random() * 100).toInt()
        }
    }

    //Check the answer, update score, return a message
    fun checkAnswer(answer:Int) : String {
        if(answer > leftNumber || answer > rightNumber)
        {
            return "Correct! You got it!"
        }
        else
        {
            return "Wrong. How can you be this bad?"
        }
    }
}