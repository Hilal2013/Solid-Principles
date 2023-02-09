package com.company.solid.openClosed.example2.good;

public class Calculator {

    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        operation.calculate(num1, num2);
//// What happens if I want to add another operation later?   % modulus
        // all i need to just create modulus class and implement interface. Am I changing in the existing classes
        //to be able to do that//im not changing//I cannot break this one
    }

}