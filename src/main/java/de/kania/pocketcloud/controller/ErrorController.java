package de.kania.pocketcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/unauthorized")
    public String handleUnauthorizedRequest(){
        return "unauthorized";
    }
}
