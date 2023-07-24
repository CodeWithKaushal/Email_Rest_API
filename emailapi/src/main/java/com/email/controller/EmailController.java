package com.email.controller;


import com.email.model.EmailRequest;
import com.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/welcome")
    public String welcome(){
        return " hello javaaaa";
    }


    //api to send email

    @PostMapping("/sendemail")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request){


        System.out.println(request);
       boolean result= this.emailService.sendEmail(request.getSubject(), request.getMessage(), request.getTo());


        if(result){
            return ResponseEntity.ok("email is sent");
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("email is not send");
        }

    }


}
