package com.tistory.bryage.example.chapter02

import com.tistory.bryage.example.chapter02.Color.*


enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getMnemonic() =
        when (this) {
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            GREEN -> "Gave"
            BLUE -> "Battle"
            INDIGO -> "In"
            VIOLET -> "Vain"
        }

    fun getWarmth() =
        when (this) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }
}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    val color = INDIGO
    println("color=${color.name}, rgb=${color.rgb()}, mnemonic=${color.getMnemonic()}, warmth=${color.getWarmth()}")
    println("mix with Yellow And Blue=${mix(YELLOW, BLUE)}")
}