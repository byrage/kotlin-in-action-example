package com.tistory.bryage.example.chapter04

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribeUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribeUser("test@kotlinlang.org").nickname)
}