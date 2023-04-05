package ru.job4j.polumorph;

/**
 * если в программе понадобится изменить реализацию,
 * то вместо изменения уже существующего кода достаточно
 * написать новую реализацию
 */
public class SportCar implements Vehicle, Fuel {
    @Override
    public void changeGear() {
        System.out.println("Механическая коробка передач."
                +
                " Включить первую, дальше переключать до шестой");
    }

    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void steer() {
        System.out.println("Укороченная рулевая"
                +
                " рейка для ускоренного поворота руля");
    }

    @Override
    public void brake() {
        System.out.println("Усиленная тормозная система");
    }

    /*
     * Далее реализуем этот интерфейс и переопределим метод refill() в классе SportCar:
     */
    @Override
    public void refill() {
        System.out.println("Заправить 100л бензина");
    }

    /*
    мы переопределяем метод chargeBattery() своей реализацией:
     */
    @Override
    public void chargeBattery() {
        System.out.println("Аккумулятор в багажнике. Зарядить.");
    }
}
