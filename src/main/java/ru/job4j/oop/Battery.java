package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
       another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(30);
        Battery two = new Battery(50);
        System.out.println("one : " + one.load + " two : " + two.load);
        one.exchange(two);
        System.out.println("one : " + one.load + " two : " + two.load);
    }
}
