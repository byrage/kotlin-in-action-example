package com.tistory.bryage.example.chapter02

class Square(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val square1 = Square(1, 3)
    val square2 = Square(3, 3)
    println("square1=${square1.isSquare}, square22=${square2.isSquare}")
}