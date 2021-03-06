package com.tistory.bryage.example.chapter07.binary

data class Point(val x: Int, val y: Int) {
//    operator fun plus(other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 * 1.5)

    println('a' * 3)

    var varPoint = Point(1,2)
    varPoint += Point(3, 4)
    println(varPoint)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}