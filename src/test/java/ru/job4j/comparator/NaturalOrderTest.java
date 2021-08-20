package ru.job4j.comparator;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Test;

public class NaturalOrderTest {
    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }
}