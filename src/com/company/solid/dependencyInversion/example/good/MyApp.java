package com.company.solid.dependencyInversion.example.good;

public class MyApp {
    public static void main(String[] args) {

//read();
    }

    public static void read(Reader reader) {
//                  for example                          xmLReader
        UserReader userReader = new UserReader(reader);

        userReader.getUsername();

    }

}