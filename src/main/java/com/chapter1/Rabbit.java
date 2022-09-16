package com.chapter1;

import com.chapter1.exeption.PerformanceException;

public class Rabbit implements Performer {
    public Fuddifier getDescription() {
        return description;
    }

    private Fuddifier description;

    public void setDescription(Fuddifier description) {
        this.description = description;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(description.postProcessAfterInitialization(description, String.valueOf(getDescription())));
    }
}
