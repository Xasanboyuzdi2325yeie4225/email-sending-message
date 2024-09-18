package org.example.emailsendmsg.controller;

import org.example.emailsendmsg.model.UserModel;
import org.example.emailsendmsg.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping(value = "/send")
    public String sendMail(@RequestBody UserModel userModel) {
        this.emailService.sendEmail(userModel);
        return "OK";
    }

}
