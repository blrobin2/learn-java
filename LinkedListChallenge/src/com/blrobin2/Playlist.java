package com.blrobin2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private String title;
    private ArrayList<Album> ownedAlbums;
    private LinkedList<Song> songsInPlaylist;

    public Playlist(String title) {
        this.title = title;
        this.ownedAlbums = new ArrayList<>();
        this.songsInPlaylist = new LinkedList<>();
    }

    void addOwnedAlbum(Album album) {
        for (Album ownedAlbum : ownedAlbums) {
            if (ownedAlbum.getTitle().equals(album.getTitle())) {
                System.out.println("Already own album " + album.getTitle());
                return;
            }
        }

        this.ownedAlbums.add(album);
    }

    void addSongToPlaylist(String songTitle) {
        for (Album album : ownedAlbums) {
            Song song = album.getSongByTitle(songTitle);
            if (song != null) {
                songsInPlaylist.add(song);
                return;
            }
        }

        System.out.println("You don't own this song!");
    }

    String listSongsInPlaylist() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Playlist: ").append(title);
        for (Song song: songsInPlaylist) {
            stringBuilder
                    .append("\nName: ")
                    .append(song.getTitle())
                    .append("\t Duration: ")
                    .append(song.getDuration());
        }
        return stringBuilder.toString();
    }

    ListIterator<Song> getPlaylistIterator() {
        return songsInPlaylist.listIterator();
    }

    boolean isEmptyPlaylist() {
        return songsInPlaylist.isEmpty();
    }
}
