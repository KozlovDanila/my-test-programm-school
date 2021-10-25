package com.email.email

import com.email.email.models.Book
import com.email.email.models.User
import org.springframework.http.HttpStatus
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
    fun createUsers(@RequestBody user: List<User>): List<User> {
        return user
    }

    @CrossOrigin
    @PostMapping("/resume")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun createResume() {
        println("adsf")
    }

    @CrossOrigin
    @PostMapping("/book")
    fun createBook(@RequestBody book: Book) : String{
        return "Вы создали книгу ${book.id} ${book.name} ${book.author}"
    }
}