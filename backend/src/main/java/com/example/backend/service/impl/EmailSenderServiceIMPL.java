package com.example.backend.service.impl;

import com.example.backend.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailSenderServiceIMPL implements EmailSenderService {
    @Autowired
    private JavaMailSender javaMailSender ;

    public void sendEmail(String receiver,
                          String subject ,
                          String body
                         ) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        String url="dummy url"; // TODO: 3/26/2023 need to add exact link  
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true, "UTF-8");
        mimeMessageHelper.setFrom("erandachamith322@gmail.com");
        mimeMessageHelper.setTo(receiver);
        mimeMessageHelper.setSubject(subject);
        String messageBody = body + "<br><a href=\"" + url + "\">" + url + "</a>";
        mimeMessageHelper.setText(messageBody, true);
        javaMailSender.send(message);

    }

}
