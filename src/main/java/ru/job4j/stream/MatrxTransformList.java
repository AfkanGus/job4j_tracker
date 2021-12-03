package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 5. Преобразование матрицы чисел в список чисел. [#110228]
 *
 * @param - Stream.of(matrx) - получим поток в виде matrx.
 * @param - .flapMap(Stream::of) - получим одномерный список
 *          куда добавятся преобразованные значения matrix.
 */
public class MatrxTransformList {
    public List<Integer> transformationToList(Integer[][] matrx) {
        return Stream.of(matrx)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
