/*
package ru.job4j.tracker;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void whenByName1lessName2() {
        Comparator<Item> cmpName = new SorterItemName();
        int rsl = cmpName.compare(
                new Item(1, "Alex"),
                new Item(2, "Ivan")
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenByName2lessName1() {
        Comparator<Item> cmpName = new SorterItemName();
        int rsl = cmpName.compare(
                new Item(1, "Petr"),
                new Item(2, "Bob")
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenByName1equalName2() {
        Comparator<Item> cmpName = new SorterItemName();
        int rsl = cmpName.compare(
                new Item(1, "Petr"),
                new Item(2, "Petr")
        );
        assertThat(rsl, equalTo(0));
    }
}*/
