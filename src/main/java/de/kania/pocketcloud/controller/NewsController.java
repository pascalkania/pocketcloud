package de.kania.pocketcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
public class NewsController {

    @RequestMapping("/news")
    public String handleNewsRequest(Model model){
        return "news";
    }
}
