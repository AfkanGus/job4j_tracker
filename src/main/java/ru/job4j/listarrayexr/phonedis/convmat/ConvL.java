package ru.job4j.listarrayexr.phonedis.convmat;

import java.util.ArrayList;
import java.util.List;

public class ConvL {
    public static List<Integer> conVert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] num : list) {
            for (Integer row : num) {
                rsl.add(row);
            }
        }
        return rsl;
    }
}
