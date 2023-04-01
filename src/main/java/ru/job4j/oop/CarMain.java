package ru.job4j.oop;

public class CarMain {
    public static void main(String[] args) {
        /**
         *  создаются объекты внутренних классов Transmission и Brakes:
         */
        Car car = new Car("Марка", "Модель");
        Car.Transmission transmission = car.new Transmission();
        /**
         * Созданный объект внутреннего класса неявно содержит в себе
         * ссылку на объект внешнего класса, независимо от конструкторов,
         * объявленных во внутреннем классе. Это нужно для создания класса
         * именно внутренним, а не обычным.
         */
        Car.Brakes brakes = car.new Brakes();
        car.startEngine();
        transmission.accelerate();
        brakes.brake();
        Car.TripComputer tripComputer = car.new TripComputer();
        tripComputer.getInfo();
    }
}
