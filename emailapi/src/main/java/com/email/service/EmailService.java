package com.email.service;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;




@Service
public class EmailService {


    public boolean sendEmail(String subject, String message, String to) {

        //rest of the code

        boolean f = false;

        String from = "test.email.api.java.program@gmail.com";

        //variable for gmail'
        String host = "smtp.gmail.com";

        //get the system properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES " + properties);

        //setting important information to proerties object


        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        //step1 : to get the seesion object......

        Session session = Session.getInstance(properties, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("test.email.api.java.program@gmail.com", "twqunafefjzcubql");

            }

        });

        session.setDebug(true);


        //step 2: compose the message [text, multi media]

        MimeMessage m = new MimeMessage(session);

        try {

            //from email

            m.setFrom(from);

            //adding recipient to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            //adding subject to message

            m.setSubject(subject);


            //adding text to message
            m.setText(message);

            //send

            //step 3: send the message using transport clas

            Transport.send(m);

            System.out.println("sent successes.............");
            f = true;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

}







