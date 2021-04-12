package ru.job4j.upcastingvehicle;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " - Мчится автобус по шоссе.");
    }
}
