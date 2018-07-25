package com.blrobin2;

class Song {
    private String title;
    private Double duration;

    Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
