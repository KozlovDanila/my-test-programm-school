package com.email.email

import com.email.email.models.Book
import com.email.email.models.Error
import com.email.email.models.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/put")
class PutControllers {

    @CrossOrigin
    @PutMapping("/user")
    fun changeUser(@RequestBody user: User): Any {
        val users = USERS.filter { it.id == user.id }
        return if (users.isNotEmpty()) User(user, users[0]) else ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Error(400, "id ${user.id} is not found"))
    }


    @CrossOrigin
    @PutMapping("/book")
    fun changeBook(@RequestBody book: Book) : String{
        return "Вы изменили книгу с идентификатором ${book.id} на значения ${book.name} ${book.author}"
    }
}