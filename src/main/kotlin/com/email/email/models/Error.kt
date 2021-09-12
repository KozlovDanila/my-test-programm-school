package com.email.email.models

class Error {

    var code: Int? = null
    var description: String? = null

    constructor()
    constructor(code: Int?, description: String?) {
        this.code = code
        this.description = description
    }

}