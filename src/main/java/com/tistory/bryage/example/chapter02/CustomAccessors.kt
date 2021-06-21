package com.tistory.bryage.example.chapter02

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val rectangle1 = Rectangle(1, 3)
    val rectangle2 = Rectangle(3, 3)
    println("rectangle1=${rectangle1.isSquare}, rectangle2=${rectangle2.isSquare}")
}