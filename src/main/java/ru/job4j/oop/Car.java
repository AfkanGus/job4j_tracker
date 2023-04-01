package ru.job4j.oop;

/**
 * 6.1. Вложенные классы: Внутренние классы [#504950]
 */
public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    /**
     * внутренний класс
     */
    public class Transmission {
        public void accelerate() {
            System.out.println("Ускорение");
        }

    }

    /**
     * внутренний класс
     */
    public class Brakes {
        public void brake() {
            System.out.println("Торможение");
        }
    }

    /**
     * Добавим в класс Car внутренний класс TripComputer с методом getInfo():
     */
    public class TripComputer {
        private String model = "Модель TripComputer";
        /**
         * Мы не можем с ней работать напрямую из класса Car,
         * так как она находится во внутреннем классе и скрыта
         * областью видимости от внешнего класс
         */
        private String tripData = "Бортовой компьютер";

        public void getInfo() {
            System.out.println("Марка: " + brand);
            System.out.println("Модель: " + model);
            System.out.println("Модель TripComputer: " + this.model);
            /**
             * Чтобы обратиться к переменной,
             * которая находится во внешнем классе, нужно обращаться через
             * имя внешнего класса и точку:
             */
            System.out.println("Модель Car: " + Car.this.model);
        }
    }

    /**
     * татические члены класса принадлежат самому классу и могут
     * использоваться без объекта этого класса, поэтому в статическом
     * контексте для создания объекта внутреннего класса требуется создать
     * сначала объект внешнего класса:
     *
     * @return
     */
    public static TripComputer getTripComputer() {
        Car car = new Car("Марка", "Модель");
        Car.TripComputer tripComputer = car.new TripComputer();
        return tripComputer;
    }
}
