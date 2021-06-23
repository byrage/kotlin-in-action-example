package com.tistory.bryage.example.chapter02

fun playFizzbuzz(number: Int) = when {
    number % 15 == 0 -> "FizzBuzz"
    number % 5 == 0 -> "Buzz"
    number % 3 == 0 -> "Fizz"
    else -> "$number"
}

fun main(args: Array<String>) {
    // play with natural order
    for (i in 1..100) {
        println(playFizzbuzz(i))
    }

    for (i in 1..15) {
        print("=")
    }
    println()

    // play with reverse order and jump to step 2
    for (i in 100 downTo 1 step 2) {
        println(playFizzbuzz(i))
    }
}
