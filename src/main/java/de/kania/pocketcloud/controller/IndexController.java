package de.kania.pocketcloud.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String handleIndexRequest(Model model){
        return "index";
    }
}
