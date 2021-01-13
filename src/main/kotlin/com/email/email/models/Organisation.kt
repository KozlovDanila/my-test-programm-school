package com.email.email.models

class Organisation {
    var id: Long? = null
    var name: String? = null
    var peopleCount: Int? = null
    var peoples: List<User>? =null



    constructor(id: Long?, name: String?, peopleCount: Int?, peoples: List<User>? = null) {
        this.id = id
        this.name = name
        this.peopleCount = peopleCount
        this.peoples = peoples
    }

    constructor()
}