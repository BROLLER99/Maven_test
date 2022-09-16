package com.chapter2;

import org.springframework.beans.factory.annotation.Autowired;

public class Coconut {

    public void drinkThemBothUp() {
        System.out.println("You put the lime in the coconut...");
        System.out.println("and drink em both up...");
        System.out.println("You put the lime in the coconut...");
        lime.drink(); // Вызов метода drink() интерфейса Lime
    }
    // Внедряемый компонент
@Autowired(required = false)
    private Lime lime; // Для внедрения
//    @Autowired
//    public void setLime(Lime lime) { // реализации
//        this.lime = lime; // интерфейса Lime
//    }
}