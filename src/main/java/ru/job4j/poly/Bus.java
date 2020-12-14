package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Пристегните ремни безопасности!");
    }

    @Override
    public void passengers(int numberPas) {
        System.out.println("Количество пассажиров - " + numberPas);
    }

    @Override
    public int tank(int gallon) {
        int maxtank = 60;
        System.out.println("Полный бак!");
        return Math.max(gallon, maxtank);
    }
}
