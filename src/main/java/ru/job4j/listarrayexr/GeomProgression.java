package ru.job4j.listarrayexr;

import java.util.List;
import java.util.ArrayList;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> prog = new ArrayList<>(count);
        int elem = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            elem = (int) (first * Math.pow(denominator, i));
            prog.add(elem);
            sum += elem;
        }
        return sum;
    }
}
