package ru.job4j.polumorph;

/**
 * Класс, реализующий интерфейс, должен обязательно
 * переопределять все абстрактные методы интерфейса Vehicle:
 */
public class TownCar implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Коробка передач автомат. Поставить селектор в режим D.");
    }

    @Override
    public void brake() {
        System.out.println("Нажатие на педаль газа механически открывает дроссельную заслонку");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }

    @Override
    public void changeGear() {
        System.out.println("Стандартное рулевое управление");
    }

    /*
    chargeBattery() можно явно не переопределять, так как он уже унаследован
     от интерфейса Vehicle. В данном примере мы его переопределили для наглядности.
     Дефолтные методы удобно использовать, если в классах, имплементирующих один и
      тот же интерфейс, должен быть объявлен метод с одинаковой реализацией.
     */
    @Override
    public void chargeBattery() {
        Vehicle.super.chargeBattery();
    }
}
