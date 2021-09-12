package com.email.email.models

class User {
    var id: Long? = null
    var name: String? = null
    var age: Int? = null

    constructor() {}
    constructor(id: Long?, name: String?, age: Int?) {
        this.id = id
        this.name = name
        this.age = age
    }

    constructor(userNew: User, userOld: User) {
        this.id = userNew.id?.let { userNew.id } ?: userOld.id
        this.name = userNew.name?.let { userNew.name } ?: userOld.name
        this.age = userNew.age?.let { userNew.age } ?: userOld.age
    }

}