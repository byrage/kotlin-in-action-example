package com.tistory.bryage.example.chapter08.returning

data class Person(val name: String, val age: Int)

fun lookForAliceWithLabel(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") {
            println("Found!")
            return@label
        }
    }
    println("Alice is not found")
}

fun lookForAliceWithForEach(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return@forEach
        }
    }
    println("Alice might be somewhere")
}

fun lookForAliceWithAnonymousFunction(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
        println("${person.name} is not Alice")
    })
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    lookForAliceWithLabel(people)
    lookForAliceWithForEach(people)
    lookForAliceWithAnonymousFunction(people)

    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}