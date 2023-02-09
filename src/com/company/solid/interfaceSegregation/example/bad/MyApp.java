package com.company.solid.interfaceSegregation.example.bad;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());

        letBirdsFly(birds);//flying
        //flying
        //for chicken no information

    }

    public static void letBirdsFly(List<Bird> birds) {
        for (Bird bird : birds) {
            bird.fly();     // Does nothing for chicken
        }
    }

}