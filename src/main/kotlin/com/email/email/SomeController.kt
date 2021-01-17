package com.email.email

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class SomeInfo {
    var id: Long? = null
    var name: String? = null
    var info: String? = null

    constructor() {}
    constructor(id: Long?, name: String?, info: String?) {
        this.id = id
        this.name = name
        this.info = info
    }
}


@RestController
@RequestMapping("/payment")
class SomeController {

    @CrossOrigin
    @GetMapping
    fun get(model: Model): SomeInfo {
        return SomeInfo(3, "nameFromServer", "infoFromServer")
    }
}