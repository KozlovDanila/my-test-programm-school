package com.email.email

import com.email.email.models.Organisation
import com.email.email.models.User
import org.springframework.beans.factory.annotation.Required
import org.springframework.web.bind.annotation.*

val USERS = listOf(
        User(1, "Oleg", 28),
        User(2, "Olga", 25),
        User(3, "Kirill", 15),
        User(4, "Vika", 40),
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
}