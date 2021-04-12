package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        //Создаем массив зполнений строками и нулями
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        //Пустой массив по размеру первого,для копирования не нелувых элементов
        String[] namesWithoutNull = new String[names.length];
        int size = 0;
        //В цикле перебираем все элементы
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            //Если элемент не равен null
            if (name != null) {
                //то записываем в пустой массив
                namesWithoutNull[size] = name;
                //Перед циклом мы объявили счетчик size.
                // Он одновременно является текущим индексом для массива namesWithoutNull
                size++;
            }
        }
        //На последнем этапе мы обрезаем новый массив по полученному размеру.
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }
    }
}

