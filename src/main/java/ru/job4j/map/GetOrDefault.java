package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.4. Возврат отличных от null значений по умолчанию.
 */

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    /**
     * @param index - ключ объекта,boolean containsKey(K key)
     *              - возвращает true, если Map уже содержит ключ key.
     * @param list  - список,V put(K key, V value) - помещает в коллекцию новый
     *              объект с ключом key и значением value. Если в коллекции уже
     *              есть объект с подобным ключом, то он перезаписывается. Если ключа еще
     *              не было в коллекции, то метод возвращает null, иначе -
     *              предыдущее значение которое соответствовало ключу key.
     */
    public void addValue(int index, List<String> list) {
        if (!store.containsKey(index)) {
            store.put(index, list);
        }
    }

    /**
     * @param index- список
     * @return V getOrDefault(K k, V defaultValue) - метод возвращает значение объекта,
     * ключ которого равен k. Если такого элемента не окажется, то будет возвращено
     * значение defaultValue.
     * getValue - должен вернуть значение которое
     * соответствует ключу index, если такого ключа нет - необходимо вернуть пустой список.
     */
    public List<String> getValue(int index) {
        return store.getOrDefault(index, new ArrayList<>());
    }
}
