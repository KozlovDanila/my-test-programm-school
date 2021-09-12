package com.email.email

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/errors")
class ErrorsControllers {

    @CrossOrigin
    @GetMapping("/301")
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    fun error301(): com.email.email.models.Error {
        return com.email.email.models.Error(301, "301 Moved Permanently («перемещено навсегда»)")
    }

    @CrossOrigin
    @GetMapping("/400")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun error400(): com.email.email.models.Error {
        return com.email.email.models.Error(400, "400 Bad Request («неправильный, некорректный запрос»)")
    }

    @CrossOrigin
    @GetMapping("/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    fun error401(): com.email.email.models.Error {
        return com.email.email.models.Error(401, "401 Unauthorized («не авторизован (не представился)»)")
    }

    @CrossOrigin
    @GetMapping("/500")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun error500(): com.email.email.models.Error {
        return com.email.email.models.Error(500, "500 Internal Server Error («внутренняя ошибка сервера»)")
    }
}