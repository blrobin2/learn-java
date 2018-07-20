package com.blrobin2;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Playlist prince = populatePlaylist();
        listenToPlaylist(prince);
    }

    private static Playlist populatePlaylist() {
        Album purpleRain = new Album("Purple Rain");
        purpleRain.addSong("When Doves Cry", 554);
        purpleRain.addSong("Purple Rain", 841);

        Album nineteen99 = new Album("1999");
        nineteen99.addSong("1999", 615);
        nineteen99.addSong("Little Red Corvette", 503);

        Playlist prince = new Playlist("Prince!");
        prince.addOwnedAlbum(purpleRain);
        prince.addOwnedAlbum(nineteen99);

        prince.addSongToPlaylist("When Doves Cry");
        prince.addSongToPlaylist("1999");
        prince.addSongToPlaylist("Little Red Corvette");
        prince.addSongToPlaylist("Purple Rain");
        prince.addSongToPlaylist("Kiss");

        return prince;
    }

    private static void listenToPlaylist(Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        if (playlist.isEmptyPlaylist()) {
            System.out.println("No songs in playlist");
            return;
        }

        ListIterator<Song> playlistIterator = playlist.getPlaylistIterator();

        System.out.println("Now listening to " + playlistIterator.next().getTitle());
        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Turning off playlist");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }
                    if (playlistIterator.hasNext()) {
                        System.out.println("Now listening to " + playlistIterator.next().getTitle());
                    } else {
                        System.out.println("Reached end of playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (playlistIterator.hasPrevious()) {
                        System.out.println("Now listening to " + playlistIterator.previous().getTitle());
                    } else {
                        System.out.println("Reached start of playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            System.out.println("Now listening to " + playlistIterator.previous().getTitle());
                            if (playlistIterator.hasNext()) {
                                playlistIterator.next();
                            }
                        } else {
                            System.out.println("At start of playlist");
                        }
                    } else {
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now listening to " + playlistIterator.next().getTitle());
                            if (playlistIterator.hasPrevious()) {
                                playlistIterator.previous();
                            }
                        } else {
                            System.out.println("At end of playlist");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Removed current song");
                    playlistIterator.remove();
                    break;
                case 5:
                    System.out.println(playlist.listSongsInPlaylist());
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\nPress: ");
        System.out.println("0 - to stop listening");
        System.out.println("1 - to go to next track");
        System.out.println("2 - to go to previous track");
        System.out.println("3 - to repeat current track");
        System.out.println("4 - to remove song from playlist");
        System.out.println("5 - to list songs in playlist");
        System.out.println("6 - to print menu options");
    }

}
