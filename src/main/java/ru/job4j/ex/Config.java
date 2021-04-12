package ru.job4j.ex;

public class Config {
    public static void load(String path) {

        if (path == null) {
            throw new IllegalArgumentException("Path could not by null");
        }
        System.out.println("load config by" + path);

    }

    public static void main(String[] args) {
        load("jdbc://Localhost:8080");
    }

}
