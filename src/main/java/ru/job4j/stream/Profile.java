package ru.job4j.stream;

/**
 * Класс - модель анкеты клиентов
 */
public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

}
