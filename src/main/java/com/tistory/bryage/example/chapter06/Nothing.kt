package com.tistory.bryage.example.chapter06

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    fail("Error occurred")
}