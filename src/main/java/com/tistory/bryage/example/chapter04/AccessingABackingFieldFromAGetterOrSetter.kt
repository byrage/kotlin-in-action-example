package com.tistory.bryage.example.chapter04_1

class User(val name: String) {
    var address: String = "unspecified address"
    set(value: String) {
        println("""
            Address was changed for $name:
            "$field" -> "$value".""".trimIndent())
        field = value
    }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}