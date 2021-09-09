package com.email.email.models

class FileInfo {

    var name: String? = null
    var size: Long? = null

    constructor(name: String?, size: Long?) {
        this.name = name
        this.size = size
    }

    constructor()
}