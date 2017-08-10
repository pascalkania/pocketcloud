package de.kania.pocketcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String handleLoginRequest(){
        return "login";
    }

    @RequestMapping("/home")
    public String handleIndexRequest(){
        return "home";
    }
}
