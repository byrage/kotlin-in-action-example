package com.tistory.bryage.example.chapter04

open class RichButton : Clickable {

    fun disable() {}
    open fun animate() {}
    override fun click() {

    }
}

class ExtendsRichButton : RichButton() {
    override fun click() {
        println("override")
    }
}