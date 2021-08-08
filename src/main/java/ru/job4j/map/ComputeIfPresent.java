package ru.job4j.map;

import java.util.Map;

/**
 * 1.5. Изменение уже существующей записи в отображении.
 */
public class ComputeIfPresent {
    /**
     *
     * V computeIfPresent​(K key, BiFunction<? super K,​ ? super V,​? extends V> remappingFunction)
     * -
     */
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (int index : name.keySet()) {
            name.computeIfPresent(index, (key, value) -> value + " " + surname.get(index));

        }
        return name;
    }
}

