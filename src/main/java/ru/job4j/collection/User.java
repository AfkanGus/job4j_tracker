package ru.job4j.collection;

import java.util.Objects;

/*Сделать сортировку для мадели*/
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name) != 0 ? name.compareTo(o.name) : Integer.compare(age, o.age);
    }
}
