package com.tistory.bryage.example.chapter05.member

fun salute() = println("Salute!")

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    run(::salute)

    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)
}