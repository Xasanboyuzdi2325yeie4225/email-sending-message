package org.example.emailsendmsg.service;

import org.example.emailsendmsg.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private final JavaMailSender mailSender;


    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    public void sendEmail(UserModel userModel) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userModel.getTo());
        message.setSubject(userModel.getSubject());
        message.setText(userModel.getText());
        message.setFrom("sAjallar01@gmail.com");
        mailSender.send(message);

    }
}
