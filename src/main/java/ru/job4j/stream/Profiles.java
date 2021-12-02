package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс с реализацией списка клиентов
 *
 * @param - profiles.stream() - получен потом данных в виде адресов клиентов
 * @param - map(Profile::getAddress) - получаем с анкеты клинтов их адреса
 * @param - sorted(Comparator.comparing(Address::getCity) - метод принимает лямбда
 * вырожение, где сравниваются адреса городов
 * @param - distinct() -метод сравнивает элементы стрима и исключает дубликаты
 * @param - collect(Collectors.toList() - и собираем полученные адреса в список
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
