package de.kania.pocketcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String requestIndexPage(Model model){
        model.addAttribute("greeting", "Hello!");
        LocalDateTime now = LocalDateTime.now();
        model.addAttribute("currentTime", now);
        return "index";
    }

}
