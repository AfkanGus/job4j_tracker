package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Конвертация двумерного массива в ArrayList [#48580 #58975]
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] in = {{1, 2},
                {3, 4}
        };
        List<Integer> result = list.toList(in);
        System.out.println(result);
    }
}
