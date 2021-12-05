package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrxTransformListTest {
    @Test
    public void whenMatrxTransformToList() {
        Integer[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        MatrxTransformList matrxTransformList = new MatrxTransformList();
        List<Integer> rsl = matrxTransformList.transformationToList(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertThat(rsl, is(expected));
    }
}