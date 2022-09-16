package com.chapter1;

import com.chapter1.exeption.PerformanceException;

public abstract class Instrumentalist implements Performer {
    public Instrumentalist() {}
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        getInstrument().play(); // Используется внедряемый метод
    } // getInstrument()
    private String song;
    public void setSong(String song) {
        this.song = song;
    }
    public abstract Instrument getInstrument(); // Внедряемый метод
}

//public class Instrumentalist {
//    public Instrumentalist() {
//    }
//    public void perform() throws PerformanceException {
//        System.out.print("Playing " + song + " : ");
//        instrument.play();
//    }
//    private String song;
//    public void setSong(String song) { // Внедрение мелодии
//        this.song = song;
//    }
//    public String getSong() {
//        return song;
//    }
//    public String screamSong() {
//        return song;
//    }
//    private Instrument instrument;
//    public void setInstrument(Instrument instrument) { // Внедрение
//        this.instrument = instrument; // инструмента
//    }
//}

