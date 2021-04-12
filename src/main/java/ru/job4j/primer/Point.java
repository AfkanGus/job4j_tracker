package ru.job4j.primer;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point x = new Point(0, 0);
        Point y = new Point(0, 2);
        double dist = x.distance(y);
        System.out.println(dist);

    }

}
