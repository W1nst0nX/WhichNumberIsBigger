package com.example.whichnumberisbigger
// POJO = Plain Old Java Object
var leftNumber = 0
var rightNumber = 0
var score = 0

class BiggerNumberGame(private val lowerLimit: Int, private val upperLimit: Int ) {

    init {
        genNumbers()
    }

    //Generate random numbers
    fun genNumbers() {
        leftNumber = (Math.random() * upperLimit + lowerLimit).toInt()
        rightNumber = (Math.random() * upperLimit + lowerLimit).toInt()
        while(leftNumber == rightNumber)
        {
            rightNumber = (Math.random() * upperLimit + lowerLimit).toInt()
        }
    }

    //Check the answer, update score, return a message
    fun checkAnswer(answer:Int) : String {
        var result: String = ""
        var biggerNumber = 0
        if(leftNumber > rightNumber) {
            biggerNumber = leftNumber
        }
        else {
            biggerNumber = rightNumber
        }
        if(answer == biggerNumber)
        {
            result = "Correct! You got it!"
            score++
            genNumbers()
        }
        else
        {
            result = "Wrong. How can you be this bad?"
            score--
            genNumbers()
        }
        return result
    }
}