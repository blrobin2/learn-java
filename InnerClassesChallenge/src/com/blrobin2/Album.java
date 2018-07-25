package com.blrobin2;

import java.util.ArrayList;
import java.util.List;

class Album {
    private String name;
    private String artist;
    private SongList songList;

    Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    boolean addSong(String title, Double duration) {
        return songList.addSong(title, duration);
    }

    boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        Song checkedSong = songList.findSong(index);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = songList.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("Song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private List<Song> songs;

        SongList() {
            this.songs = new ArrayList<>();
        }

        boolean addSong(String title, double duration) {
            if (findSong(title) != null) {
                return false;
            }
            songs.add(new Song(title, duration));
            return true;
        }

        Song findSong(String title) {
            for (Song checkedSong: songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        Song findSong(int index) {
            if (index >= 0 && index <= this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }
    }
}
