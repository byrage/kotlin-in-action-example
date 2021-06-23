package com.tistory.bryage.example.chapter02

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "Digit"
    in 'a'..'Z' -> "Letter"
    else -> "Unknown"
}

fun main(args: Array<String>) {
    println(recognize('8'))
    println(recognize('*'))
}