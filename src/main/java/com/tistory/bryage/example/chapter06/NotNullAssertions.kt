package com.tistory.bryage.example.chapter06

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!! // !! will throw NPE
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}