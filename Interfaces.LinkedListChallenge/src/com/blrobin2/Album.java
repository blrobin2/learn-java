package com.blrobin2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    boolean addSong(String title, Double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong: songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("Song " + title + " is not in this album");
        return false;
    }
}
