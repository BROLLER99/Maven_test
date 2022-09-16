package com.chapter1;

import com.chapter1.exeption.PerformanceException;

public class Vocalist implements Performer{
    public void setSong(String song) {
        this.song = song;
    }

    private String song;

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Песня: "+ song);
    }
}
