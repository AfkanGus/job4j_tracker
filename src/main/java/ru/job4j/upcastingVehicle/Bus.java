package ru.job4j.upcastingVehicle;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()+" - Мчится автобус по шоссе.");
    }
}
