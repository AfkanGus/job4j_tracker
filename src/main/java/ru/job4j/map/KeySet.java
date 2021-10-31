package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.3 Получть значения  отображения по ключу.
 * V get(K key) - метод возвращает значение объекта,
 * которому соответствует ключ key. Если вдруг окажется,
 * что такого элемента нет - то метод вернет null.
 * Set<K> keySet() - возвращает набор всех ключей отображения.
 */
public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
