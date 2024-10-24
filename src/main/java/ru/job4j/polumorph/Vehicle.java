package ru.job4j.polumorph;

/**
 * 4.0. Что такое Interface. [#504946].
 * Интерфейс - это абстрактный класс, в котором не реализован ни один метод.
 * С помощью этих методов описывается некое поведение, которое должно быть
 * реализовано в классах, применяющих этот интерфейс.
 * Цель интерфейса - абстрагировать интерфейс класса от его реализации
 */
public interface Vehicle {
    /*
    Добавим в интерфейс Vehicle (транспортное средство) методы,
     описывающие поведение транспортного средства:
     */
    void accelerate();

    void brake();

    void steer();

    void changeGear();

    /*
    Ранее мы говорили о том, что интерфейс должен содержать
     абстрактные методы (пустые, без реализации), но начиная
      с Java 8 мы также можем включать в интерфейсы методы
       с реализацией - статические (static) или дефолтные (default),
        а начиная с Java 9 еще и приватные (private).
     */
    static void getDragCoefficient() {
        System.out.println("Формула расчета коэффициента"
                +
                " аэродинамического сопротивления автомобиля");
    }

    /*
     дефолтные методы - так же, как и статические, они имеют
      реализацию, но при их объявлении используется ключевое
       слово default.
       Главное отличие дефолтного метода в том, что он будет унаследован классом,
       который реализует данный интерфейс. При этом класс может как переопределить
       данный метод, так и не переопределять и воспользоваться реализацией по умолчанию.
     */
    default void chargeBattery() {
        System.out.println("Аккумулятор под капотом. Зарядить.");
    }
}
