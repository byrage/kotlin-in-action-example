package com.tistory.bryage.example.chapter06

fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))

    val b: Byte = 1
    val l = b + 1L
    foo(l)

    println("42".toInt())
}

