package com.chapter1;

import com.chapter1.exeption.PerformanceException;

import java.util.ArrayList;

public class City implements Performer{
        public void setName(String name) {
                this.name = name;
        }

        public void setState(String state) {
                this.state = state;
        }

        public void setPopulation(int population) {
                this.population = population;
        }

        public String getName() {
                return name;
        }

        private String name;

        public String getState() {
                return state;
        }

        private String state;

        public int getPopulation() {
                return population;
        }

        private int population;
        private City chosenCity;


        public void setBigCities(City bigCities) {
                this.bigCities = bigCities;
        }

        private City bigCities;


        public void setCityNames(ArrayList cityNames) {
                this.cityNames = cityNames;
        }

        private ArrayList cityNames;

        public void setChosenCity(City chosenCity) {
                this.chosenCity = chosenCity;
        }

        @Override
        public void perform() throws PerformanceException {
//                System.out.println("Название: " + chosenCity.getName());
//                System.out.println("Штат: " + chosenCity.getState());
//                System.out.println("Население: " + chosenCity.getPopulation());

                System.out.println(cityNames);

        }
}
