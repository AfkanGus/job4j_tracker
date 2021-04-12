package ru.job4j.ooa;

public final class Airbus extends Aircraft {

    private static int counEengine;

    private String name;

    public Airbus(String name, int counEengine) {
        this.name = name;
        this.counEengine = counEengine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + counEengine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
