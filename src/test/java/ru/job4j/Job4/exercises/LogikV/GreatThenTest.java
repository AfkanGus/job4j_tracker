package ru.job4j.Job4.exercises.LogikV;
/*
* 1.1. Первое больше второго
Чтобы проверить, что первое число больше
* второго в Java используется оператор ">".
Результат вычисления оператора ">" будет
* переменная типа boolean.
Пример.
boolean result = first > second;
Допишите программу приведенную ниже.
* Программа должна вернуть истина, если первое число больше второго*/

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class GreatThenTest {
    @Test
    public void whenFirstLess() {
        assertThat(
                GreatThen.chek(1, 2),
                is(false)
        );
    }

    @Test
    public void whenFirstGreat() {
        assertThat(
                GreatThen.chek(10, 2),
                is(true)
        );
    }
}