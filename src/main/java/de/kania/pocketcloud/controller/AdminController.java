package de.kania.pocketcloud.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class AdminController {
    private static final Log LOGGER = LogFactory.getLog(MusicController.class);

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/admin")
    @RolesAllowed("ADMIN")
    public String handleAdminRequest(Model model){
        List<String> beans = Arrays.asList(context.getBeanDefinitionNames());
        model.addAttribute("beans",beans);
        return "admin";
    }
}
