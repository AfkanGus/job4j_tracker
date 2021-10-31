package ru.job4j.listarrayexr;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{2, 3});
        List<Integer> rsl = ConvertMatrix2List.convert(in);
        System.out.println(in);
    }
}
