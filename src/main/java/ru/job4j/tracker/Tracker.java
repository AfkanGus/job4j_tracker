package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    //Получения списка всех заявок
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        /*Находим индекс*/
        int index = indexOf(id);
        /*Если индекс найден возвращаем item,иначе null*/
        return index != -1 ? items[index] : null;
    }


    //Получение списка по имени
    public Item[] findByName(String key) {
        Item[] findItems = new Item[size];
        int digit = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                findItems[digit] = items[i];
                digit++;
            }
        }
        return Arrays.copyOf(findItems, digit);
    }

    //Метод,возвращающий index по id
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    //Метод замены заявки,удаляя старую добавлять новую заявку
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        //Запишем с валидацией
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
            items[index].setId(id);
        }
        return rsl;
    }

       /* if (index == -1) {
            return false;
        }
        items[index] = item;
        items[index].setId(id);
        return true;*/


    //Метод удаления заявкки
    public boolean delete(int id) {
        int index = indexOf(id);
        //Запишем с валидацией
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, index, items, index + 1, size - index);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
       /* if (index == -1) {
            return false;
        }
        System.arraycopy(items, index, items, index + 1, size - index);
        items[size - 1] = null;
        size--;
        return true;*/
}
