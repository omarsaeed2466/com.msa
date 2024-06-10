package com.example.microservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
@RestController
    class  MsiTestConroller{
@GetMapping("api/test.message")
        public  String displayMessage(){
return "this is message from ms1";
        }
}
}
