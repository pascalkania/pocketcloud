package de.kania.pocketcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

    @RequestMapping("/admin")
    @RolesAllowed("ADMIN")
    public String handleAdminRequest(Model model){
        return "admin";
    }
}
