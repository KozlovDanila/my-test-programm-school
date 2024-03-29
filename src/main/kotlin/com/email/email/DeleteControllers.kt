package com.email.email

import com.email.email.models.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/delete")
class DeleteControllers {

    @CrossOrigin
    @DeleteMapping("/user")
    fun changeUser(@RequestParam id: Long): List<User> {
        return USERS.filter { it.id != id }
    }

    @CrossOrigin
    @DeleteMapping("/book")
    fun deleteBook(@RequestParam id: Long): String{
        return "Вы удалили книгу под идентификатором $id"
    }
}