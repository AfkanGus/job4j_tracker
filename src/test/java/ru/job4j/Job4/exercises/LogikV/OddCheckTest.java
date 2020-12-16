package ru.job4j.Job4.exercises.LogikV;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class OddCheckTest {

    @Test
    public void OddCheckTest() {
        assertFalse(OddCheck.chek(2));
        assertTrue(OddCheck.chek(3));
    }
}