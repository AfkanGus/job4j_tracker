package ru.job4j.listarrayexr.phonedis.arraylist;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConVTest {
    @Test
    public void name() {
        ConV list = new ConV();
        int[][] rsl = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3
        );

        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(rsl, is(expect));
    }
}