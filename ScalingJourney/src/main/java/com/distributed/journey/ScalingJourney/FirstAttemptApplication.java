package com.distributed.journey.ScalingJourney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAttemptApplication {

    @RequestMapping("/try")
    public String home() {
        StringBuilder str = new StringBuilder();
        str.append("Hey-").append(Math.random());
        System.out.println(str);
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println("FirstAttemptApplication running");
        SpringApplication.run(FirstAttemptApplication.class, args);
    }
}
