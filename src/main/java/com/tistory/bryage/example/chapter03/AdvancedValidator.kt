package com.tistory.bryage.example.chapter03

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user. userId=${id}, fieldName=${fieldName}"
            )
        }
    }

    validate(name, "name")
    validate(address, "address")
}

fun saveUser2(user: User) {
    user.validateBeforeSave()
}


fun main(args: Array<String>) {
    saveUser2(User(1, "", ""))
}