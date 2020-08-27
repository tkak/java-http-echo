package com.example.httpecho;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Value("${text}")
    private String text;

    @RequestMapping("/")
    public @ResponseBody String home() {
        return text;
    }
}
