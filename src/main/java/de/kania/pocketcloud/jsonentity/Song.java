package de.kania.pocketcloud.jsonentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {
    String title;

    String[] artist;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getArtist() {
        return artist;
    }

    public void setArtist(String[] artist) {
        this.artist = artist;
    }
}