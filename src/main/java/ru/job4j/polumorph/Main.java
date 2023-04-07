package ru.job4j.polumorph;

/**
 * Создадим класс Main и выполним методы класса TownCar.
 * <p>
 * в классе Main типом переменной townCar является не TownCar,
 * а Vehicle, то есть переменная типа Vehicle хранит
 * ссылку на объект TownCar
 * В случае подобного наследования интерфейсов мы теперь можем в методе main()
 * объявить объект sportCar как тип всеобъемлющего интерфейса, то есть Vehicle,
 * так как Vehicle наследует методы Fuel, а также определяет свои методы:
 * Для вызова метода, определенного как static,
 * нужно указать имя интерфейса и через точку название метода.
 */
public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.changeGear();
        vehicle.accelerate();
        vehicle.steer();
        vehicle.brake();
        fuel.refill();
        Vehicle.getDragCoefficient();
    }
}
