package com.tistory.bryage.example.chapter03

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Address"
        )
    }

    // Save user to the database
}

fun saveUserAdvanced(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user. userId=${user.id}, fieldName=${fieldName}"
            )
        }
    }

    validate(user.name, "name")
    validate(user.address, "address")
}

fun main(args: Array<String>) {
//    saveUser(User(1, "", ""))

    saveUserAdvanced(User(1, "", ""))
}