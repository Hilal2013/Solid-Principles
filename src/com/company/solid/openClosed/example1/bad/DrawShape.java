package com.company.solid.openClosed.example1.bad;

import java.util.List;

public class DrawShape {

    public void draw(List<Object> shapes) {

        for (Object shape : shapes) {

            if (shape instanceof Circle) {
                System.out.println("Drawing a circle.");
            }

            if (shape instanceof Rectangle) {
                System.out.println("Drawing a rectangle.");
            }

            // What if we need to draw another shape later?  -  Triangle
//you create triangle class
//            if (shape instanceof Triangle) {
//                System.out.println("Drawing a triangle.");
//            }
//did I do some modification on existing class?i did and thats not goood//
            //solutuion is abstract
        }

    }
}