package ru.job4j.upcastingVehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()+ " - Поезд двигается по рельсам.");
    }
}
