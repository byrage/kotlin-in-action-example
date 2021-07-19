package com.tistory.bryage.example.chapter06.elvis

fun strLenSafe(s: String?): Int = s?.length ?: 0

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with (address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    printShippingLabel(Person("Dmitry", jetbrains))
    printShippingLabel(Person("Alexey", null))
}