package com.tistory.bryage.example.chapter06

private fun buildAlphabet(): CharRange {
//    return Array<String>(26) { i -> ('a' + i).toString() }
//    val letterSequence = generateSequence('a') {
//        it + 1
//    }
//    return letterSequence.takeWhile { it <= 'z' }
    return 'a'..'z'
}

fun main(args: Array<String>) {
    val letters = buildAlphabet()
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())
}
