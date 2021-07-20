package com.tistory.bryage.example.chapter07

class Email

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }
}

class LazyPerson(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf()
}

fun loadEmails(person: LazyPerson): List<Email> {
    println("Load emails for ${person.name}")
    return listOf()
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    p.emails
    p.emails

    val lp = Person("Alice")
    lp.emails
    lp.emails
}
