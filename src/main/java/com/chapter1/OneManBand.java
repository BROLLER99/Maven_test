package com.chapter1;

import com.chapter1.exeption.PerformanceException;

import java.util.Properties;


public class OneManBand implements Performer {

    public OneManBand() {
    }
    public void perform() throws PerformanceException {
        for (String key: instruments.stringPropertyNames()) {
            System.out.println(key + ":" + instruments.get(key));
        }
        }
    private Properties instruments;
    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
