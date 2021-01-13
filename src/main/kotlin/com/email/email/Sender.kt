package com.email.email

import java.util.*
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

class Sender(private val username: String, private val password: String) {

    private val props: Properties = Properties()

    fun send(title: String?, text: String?, toEmail: String?) {
        val session = Session.getDefaultInstance(props, object : Authenticator() {
            override fun getPasswordAuthentication(): PasswordAuthentication {
                return PasswordAuthentication(username, password)
            }
        })
        try {
            val message: Message = MimeMessage(session)
            //от кого
            message.setFrom(InternetAddress(username))
            //кому
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail))
            //тема сообщения
            message.setSubject(title)
            //текст
            message.setText(text)

            //отправляем сообщение
            Transport.send(message)
        } catch (e: MessagingException) {
            throw RuntimeException(e)
        }
    }

    init {
        props.put("mail.smtp.host", "smtp.gmail.com")
        props.put("mail.smtp.socketFactory.port", "465")
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory")
        props.put("mail.smtp.auth", "true")
        props.put("mail.smtp.port", "465")
    }
}