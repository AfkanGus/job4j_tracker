package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThenZero() {
        Fact.calc(-1);
    }
    @Test
        public void whenTo3then6() {
            int res = Fact.calc(3);
            assertThat(res, is(6));
        }
    }
