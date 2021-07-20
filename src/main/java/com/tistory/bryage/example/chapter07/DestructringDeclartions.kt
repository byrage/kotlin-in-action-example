package com.tistory.bryage.example.chapter07.destructring

fun printEntries(map: Map<String, String>) {
    for((key, value ) in map) {
        println("$key -> $value")
    }
}

data class Point(val x: Int, val y: Int)

data class NameComponents(
    val name: String,
    val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main(args: Array<String>) {
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)

    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)

    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}