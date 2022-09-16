package com.chapter1;

import com.chapter2.Coconut;
import com.chapter2.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Coconut coconut = (Coconut) ctx.getBean("coconut");
        coconut.drinkThemBothUp();
    }
}
