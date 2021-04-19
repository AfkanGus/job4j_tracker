package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель пользователя банка
 *
 * @author Afkan Guseynov
 * @version 1.0
 */
public class User {
    /**
     * passport - хранит значение объекта паспорта пользователя
     */
    private String passport;
    /**
     * username - имя пользователя
     */
    private String username;

    /**
     * Коструктор
     *
     * @param passport - паспорт
     * @param username - имя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределения метода equals для сравнивания объектв модели
     *
     * @param obj - объект пользователь
     * @return true -если равны,false - если не равны
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение hashCode() метода
     *
     * @return hashcode паспорт
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

}
