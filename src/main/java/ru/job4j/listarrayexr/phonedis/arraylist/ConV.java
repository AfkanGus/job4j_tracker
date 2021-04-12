package ru.job4j.listarrayexr.phonedis.arraylist;

import java.util.List;

public class ConV {
    public static int[][] toArray(List<Integer> list, int cells) {

        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell >= cells) {
                cell = 0;
                row++;
            }
            array[row][cell] = num;
            cell++;
        }
        return array;

    }
}
