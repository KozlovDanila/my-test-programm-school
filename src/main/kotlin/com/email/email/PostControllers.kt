package com.email.email

import com.email.email.models.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/post")
class PostControllers {

    @CrossOrigin
    @PostMapping("/create")
    fun createUser(@RequestBody user: User): User {
        return user
    }

    @CrossOrigin
    @PostMapping("/create/list")
    fun getUsers(@RequestBody user: List<User>): List<User> {
        return user
    }
}