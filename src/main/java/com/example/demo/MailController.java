package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@Component
public class MailController {
	
	@Autowired
    JavaMailSender javaMailSender;
     
     @RequestMapping("/sendEmail")
     @Scheduled(fixedRate = 5000)
        public String helloSpringBoot(){
              
         SimpleMailMessage message = new SimpleMailMessage();
             
            message.setFrom("vaitheeswaran268@gmail.com");
            message.setTo("girirajvaitheeswaran@gmail.com", "rvdeepak.mba@gmail.com", "kanimozhi233472@gmail.com", "sivasakthicg16@gmail.com");
            message.setSubject("Subject : Sample Email Subject");
            message.setText("Body : This is sample mail mail Body.");
             
            javaMailSender.send(message);
             
            System.out.println("Mail successfully sent..");
             
            return "Your Mail sent successfully";
        }
     
     
     public void display()
     {
    	 System.out.println("Printing");
     }
     
     

}
