package com.example.httpecho;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class HttpEchoApplication {

    @Value("${text}")
    private String text;

    @RequestMapping("/")
    String home() {
        return text;
    }

	public static void main(String[] args) {
		SpringApplication.run(HttpEchoApplication.class, args);
	}
}
