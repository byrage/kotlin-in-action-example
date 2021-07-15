package com.tistory.bryage.example.chapter04_1

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    val bob2 = Client("Bob", 973293)

    println(bob == bob2)
    println(bob.copy(postalCode = 382555))
}