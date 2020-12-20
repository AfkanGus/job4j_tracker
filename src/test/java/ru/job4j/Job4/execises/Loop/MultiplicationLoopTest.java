package ru.job4j.Job4.execises.Loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {
    @Test
    public void test() {
        assertEquals(0, MultiplicationLoop.multi(0, 2));
        assertEquals(2, MultiplicationLoop.multi(1, 2));
        assertEquals(6, MultiplicationLoop.multi(1, 3));
    }
}