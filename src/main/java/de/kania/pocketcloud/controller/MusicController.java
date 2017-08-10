package de.kania.pocketcloud.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class MusicController {

    AtomicInteger counter = new AtomicInteger();
    Set<Integer> musicSet = new HashSet<>();

    @RequestMapping("/music")
    public String handleArticlesRequest(Model model){
        model.addAttribute("musiclist",musicSet);
        return "music";
    }

    @Scheduled(fixedDelay = 5000)
    public void doSomething() {
        musicSet.add(counter.getAndIncrement());
    }
}
