package com.tistory.bryage.example.chapter03

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(joinToString(list))
    println(joinToString(list, postfix = "end", prefix = "start"))
    println(joinToString(list, "|"))
    println("Kotlin".lastChar())
    println("12.345-6.A".split("\\.|-".toRegex()))
}