package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int id = 1;


    private Tracker() {

    }

    public static Tracker getInstance() {
        Tracker instance = null;
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(id++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public List<Item> findAll() {
        return items;
    }

    public void showAll() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public List<Item> findByName(String key) {
        ArrayList<Item> clearedItems = new ArrayList<Item>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                clearedItems.add(item);
            }
        }
        return clearedItems;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId() == id) {
                rsl = items.indexOf(item);
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        for (Item i : items) {
            if (i.getId() == id) {
                items.set(items.indexOf(i), item);
                item.setId(id);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        for (Item item : items) {
            if (item.getId() == id) {
                items.remove(item);
                result = true;
                break;
            }
        }
        return result;
    }
}
/*

 */
/*добавили final для запрета наследования*//*

public final class Tracker {
    */
/*поле для ссылки на объект*//*

    private static Tracker instance = null;
    */
/*private final Item[] items = new Item[100];*//*

    private final List<Item> items = new ArrayList<>();

    private int id = 1;
*/
/*
    private int size = 0;
*//*


 */
/*создаем конструктор*//*

    private Tracker() {

    }

    */
/*стат. метод для получения ссылки на объект*//*

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(id++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    */
/*public Item[] findAll() {
        Item[] clearedItems = new Item[size];
        clearedItems = Arrays.copyOf(items, size);
        return clearedItems;
    }*//*

    public List<Item> findAll() {
        return items;
    }

    public void showAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i].toString());
        }
    }

    public List<Item> findByName(String key) {
        ArrayList<Item> clearedItems = new ArrayList<Item>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                clearedItems.add(item);
            }
        }
        return clearedItems;
    }

    public Item findById(int id) {
        */
/* *//*
 */
/* Находим индекс *//*
 */
/*
        int index = indexOf(id);
        *//*
 */
/* Если индекс найден возвращаем item, иначе null *//*
 */
/*
        return index != -1 ? items[index] : null;*//*

        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            items.set(index, item);
            item.setId(id);
            // items[index] = item;
            // items[index].setId(id);
            return true;
        }


        public boolean delete (int id){
            int index = indexOf(id);
            if (index == -1) {
                return false;
            }
            items.remove(index);
            return true;
        }
*/

