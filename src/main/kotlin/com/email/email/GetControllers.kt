package com.email.email

import com.email.email.models.Book
import com.email.email.models.Country
import com.email.email.models.Organisation
import com.email.email.models.User
import org.springframework.web.bind.annotation.*

val USERS = listOf(
        User(1, "Oleg", 28),
        User(2, "Olga", 25),
        User(3, "Kirill", 15),
        User(4, "Vika", 40),
)

val BOOKS = listOf(
        Book(1, "Преступление и наказание", "Фёдор Михайлович Достоевский"),
        Book(2, "Старик и море", "Эрнест Миллер Хемингуэй"),
        Book(3, "Евгений Онегин", "Александр Сергеевич Пушкин"),
        Book(4, "Три мушкетера", "Александр Дюма")
)

@RestController
@RequestMapping("/get")
class GetControllers {

    @CrossOrigin
    @GetMapping("/users")
    fun getUsers(): List<User> {
        return USERS
    }

    @CrossOrigin
    @GetMapping("/organisations")
    fun getOrganisations(@RequestParam id: Long?): List<Organisation> {
        val usersUlmart = listOf(
                User(1, "Oleg", 28),
                User(2, "Olga", 25),
        )
        val usersAlmart = listOf(
                User(3, "Kirill", 15),
        )

        val listOf = listOf(
                Organisation(1, "Улмарт", usersUlmart.size, usersUlmart),
                Organisation(2, "Алмарт", usersAlmart.size, usersAlmart),
                Organisation(3, "Олморт", 0),
        )
        return id?.let { listOf.filter { it.id == id } } ?: listOf
    }

    @CrossOrigin
    @GetMapping("/countries")
    fun getCountries(): List<Country> {
        return listOf(
                Country(1, "Россия"),
                Country(2, "Украина"),
                Country(3, "Белорусь")
        )
    }

    @CrossOrigin
    @GetMapping("/books")
    fun getBooks(@RequestParam name: String?, @RequestParam author: String?): List<Book>? {
        if (name != null && author != null) {
            return BOOKS.filter { v -> v.name == name && v.author == author}
        }
        if (name != null) {
            return BOOKS.filter { v -> v.name == name }
        }
        if (author != null) {
            return BOOKS.filter { v -> v.author == author }
        }
        return BOOKS
    }
}