package de.kania.pocketcloud.controller;

import de.kania.pocketcloud.jsonentity.Song;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class MusicController {
    Set<Song> musicSet = new HashSet<>();

    @RequestMapping("/music")
    public String handleArticlesRequest(Model model){
        model.addAttribute("musiclist",musicSet);
        return "music";
    }

    @Scheduled(fixedDelay = 60000)
    public void doSomething() {
        RestTemplate restTemplate = new RestTemplate();
        Song[] songs = restTemplate.getForObject("http://api.laut.fm/station/deepahouse/last_songs", Song[].class);
        if(musicSet.size()>= 200){
            musicSet.clear();
        }
        Arrays.stream(songs).filter(song -> !song.getTitle().equalsIgnoreCase("Verbraucherinformation")).forEach(song -> {
            musicSet.add(song);
            System.out.println(song);
        });
    }
}
