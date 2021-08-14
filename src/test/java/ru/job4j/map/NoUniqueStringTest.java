package ru.job4j.map;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import static org.hamcrest.core.Is.is;


public class NoUniqueStringTest {
    @Test
    public void checkData() {
        String[] data = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = NoUniqueString.ckeckDat(data);
        Map<String, Boolean> expected = Map.of("a", true, "b", true, "c", false);
        assertThat(rsl, is(expected));
    }
}