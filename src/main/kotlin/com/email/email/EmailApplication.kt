package com.email.email

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmailApplication

fun main(args: Array<String>) {
    runApplication<EmailApplication>(*args)
}

//fun main() {
//    Sender("programm.school.tver@gmail.com", "dhjnt,fk'kmyehf996")
//            .send("Моё первое сообщение", "Тут моё сообщение", "programm.school.tver@gmail.com")
//}
