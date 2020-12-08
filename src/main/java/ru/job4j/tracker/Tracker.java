package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    //Добавление заявок
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    //Получения списка всех заявок
    public Item[] findAll() {
        Item[] items = new Item[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                items[index] = items[i];
                index++;
            }
        }
        return items;
    }

    //Получение заявок по ID
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    //Получение списка по имени
    public Item[] findByName(String key) {
        Item[] items = new Item[size];
        int digit = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                items[digit] = items[i];
                digit++;
            }
        }
        return items;
    }
}