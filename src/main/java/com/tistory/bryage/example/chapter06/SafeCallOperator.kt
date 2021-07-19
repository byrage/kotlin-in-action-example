package com.tistory.bryage.example.chapter06

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.uppercase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}