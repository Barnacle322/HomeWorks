package com.company;

public class Song {
    public String name;
    public String author;
    public String lyrics;
    public String genre;

    public Song(String name, String author, String lyrics, String genre) {
        this.name = name;
        this.author = author;
        this.lyrics = lyrics;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFullSong() {
        String msg = this.name + "\n" + this.author + "\n" + this.genre + "\n" + this.lyrics;
        return msg;
    }
}
