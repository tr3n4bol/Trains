package com.example.Trains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralContentController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/hellopage")
    public String helloPage() {
        return "hellopage";
    }

    @GetMapping("/home")
    public String homepage() {
        return "home";
    }
}
