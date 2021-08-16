package ru.job4j.map;

import java.util.*;

/**
 * 2.4 Данные об осадках
 * Метод принимает список объектов Info.
 * Причем два объекта содержат два поля:
 * 1. city - название города, где производились надлюдения;
 * 2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
 * Необходимо реализовать метод так, чтобы в результате вернуся список объектов info в
 * котором будет указано имя города наблюдения и общее количество осадков за период наблюдения,
 */
public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> city = new HashMap<>();
        for (Info elem : list) {
            city.computeIfPresent(elem.getCity(), (key, val) -> val + elem.getRainfall());
            city.putIfAbsent(elem.getCity(), elem.getRainfall());
        }
        for (String key : city.keySet()) {
            rsl.add(new Info(key, city.get(key)));
        }
        return rsl;
    }

    public static class Info {
        private String city;
        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
