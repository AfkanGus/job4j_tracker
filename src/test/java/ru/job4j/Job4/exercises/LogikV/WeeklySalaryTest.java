package ru.job4j.Job4.exercises.LogikV;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class WeeklySalaryTest {
    @Test
    public void calculateIs400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculate410() {
        int[] hours = {10, 10, 10, 10, 10, 8, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(410));
    }

    @Test
    public void calculateIs690() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(690));
    }
}