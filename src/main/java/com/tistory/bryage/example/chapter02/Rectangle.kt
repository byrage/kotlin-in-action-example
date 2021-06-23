package com.tistory.bryage.example.chapter02

import kotlin.random.Random

class Rectangle2(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle2 {
    val randomInt = Random.nextInt()
    return Rectangle2(randomInt, randomInt)
}

fun main() {
    val randomRectangle = createRandomRectangle()
    println(randomRectangle.isSquare)
}
