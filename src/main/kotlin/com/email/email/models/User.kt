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
}