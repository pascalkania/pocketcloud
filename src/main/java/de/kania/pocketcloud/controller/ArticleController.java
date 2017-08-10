package de.kania.pocketcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ArticleController {

    @RequestMapping("/articles")
    public String handleArticlesRequest(Model model){
        return "news";
    }
}
