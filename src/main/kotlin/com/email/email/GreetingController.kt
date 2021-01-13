package com.email.email

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
class GreetingController {

    private val sender: Sender = Sender("programm.school.tver@gmail.com", "dhjnt,fk'kmyehf996")

    @RequestMapping(value = ["/send_email"], method = [RequestMethod.GET])
    fun greetingForm(model: Model): String {
        model.addAttribute("email", Email())
        return "send_email"
    }

    @RequestMapping(value = ["/send_email"], method = [RequestMethod.POST])
    fun greetingSubmit(@ModelAttribute email: Email?, model: Model): String {
        model.addAttribute("emailInfo", email)
        sender.send(email?.title, email?.message + " " + email?.email, "programm.school.tver@gmail.com")
        return "result"
    }
}