package com.tistory.bryage.example.chapter05.lambda

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum(1, 2))
    run { println(42) }

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ", transform = { it.name })
    println(names)
}