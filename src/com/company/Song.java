package com.company;

public class Song {
   private String name;
   private String artistName;
   private String text;
   private String genre;

    public void setName(String name) {
        this.name = name;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getText() {
        return text;
    }

    public String getGenre() {
        return genre;
    }
}
