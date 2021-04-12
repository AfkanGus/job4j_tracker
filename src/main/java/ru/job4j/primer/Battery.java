package ru.job4j.primer;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(5);
        Battery second = new Battery(1);
        System.out.println("First exchange: " + first.load + ". second" + second.load);
        first.exchange(second);
        System.out.println("First exchange: " + first.load + ". second" + second.load);
    }
}
