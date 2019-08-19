package com.example.patterns.singletone;

public class Singletone {

    private static Singletone singletone;
    private  String name;

    private Singletone(String text) {
        name = text;
    }

    public static Singletone getSingletone(String text) {
        if (singletone == null) {
            singletone = new Singletone(text);
        }
        return singletone;
    }

    public String getName() {
        return name;
    }
}
