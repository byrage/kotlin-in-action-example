package com.tistory.bryage.example.chapter02

class Person(
    val name: String,
    val isMarried: Boolean
)

fun main() {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}