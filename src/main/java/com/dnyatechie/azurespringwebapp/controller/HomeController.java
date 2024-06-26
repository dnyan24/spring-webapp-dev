package com.dnyatechie.azurespringwebapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/home")
    public String message()
    {
        return "Hey Congrats your application deployed successfully deployed to Azure webapp";
    }
}
