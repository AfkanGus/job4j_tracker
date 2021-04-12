package ru.job4j.upcastingvehicle;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " - Самолет летает высоко в небе.");
    }
}
