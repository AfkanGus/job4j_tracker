package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountTest {

    /*Если нам нужно проверить ситуацию, когда программа
    прерывается с исключением нам нужно в аннотации
     @Test указать класс исключения.*/
    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }
    @Test
    public void when0to2then3() {
        int rsl = Count.add(0, 3);
        assertThat(rsl, is(3));
    }
}