package com.tistory.bryage.example.chapter04

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable")
}

class Button: Clickable, Focusable {
    override fun click() = println("I was clicked")
    // showDiff를 오버라이드 하지 않으면 둘중에 어떤 showDiff를 구현해야 할지 몰라서 컴파일 에러 발생
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    Button().click()
    Button().showOff()
}