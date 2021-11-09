package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class FuncDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(50D, 72D, 98D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> 2 * x);
        List<Double> expected = Arrays.asList(10D, 12D, 14D);
        assertThat(result, is(expected));
    }
}