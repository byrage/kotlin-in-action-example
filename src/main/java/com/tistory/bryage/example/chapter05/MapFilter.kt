package com.tistory.bryage.example.chapter05

fun main(args: Array<String>) {
    val result = listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()

    println()
    println("type=${result.javaClass.kotlin}, result=${result}")
}