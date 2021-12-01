package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс с реализацией списка клиентов
 *
 * @param - profiles.stream() - получен потом данных в виде адресов клиентов
 * @param - map(Profile::getAddress) - получаем с анкеты клинтов их адреса
 * @param - collect(Collectors.toList() - и собираем полученные адреса в список
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
