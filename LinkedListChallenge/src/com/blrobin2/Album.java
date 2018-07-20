package com.blrobin2;

import java.util.ArrayList;

class Album {
    private String title;
    private ArrayList<Song> songs;

    Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    String getTitle() {
        return title;
    }

    Song getSongByTitle(String title) {
        for (Song song: songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    void addSong(String title, int duration) {
        if (getSongByTitle(title) != null) {
            System.out.println("Song " + title + " already in album");
            return;
        }
        this.songs.add(new Song(title, duration));
    }
}
