package com.tistory.bryage.example.chapter07.storing

class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes // _attributes[name]
    val company: String by _attributes
    val unknown : String by _attributes

    override fun toString(): String {
        return _attributes.entries.joinToString(prefix = "Person{", postfix = "}")
    }
}

fun main(args: Array<String>) {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)

    println(p)
    println(p.name)
    println(p.company)
    println(p.unknown)
}