package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * peek() - это промежуточная операция. Выполняет действие для каждого
 * элемента потока, возвращая поток, состоящий из
 * измененных элементов.
 * <p>
 * forEach() - это конечная операция. Выполняет действие для каждого
 * элемента потока, завершая поток.
 * акже метод peek() похож на метод map(). Разница между этими методами в том, что peek() просто преобразует элементы
 * потока и возвращает поток из измененных элементов того же типа, а метод map() в процессе преобразования элементов
 * может возвращать поток из элементов другого типа после изменения. Поэтому метод peek() чаще используется в
 * отладочных целях для вывода состояния элемента в потоке, нежели для каких-либо преобразований.
 */
public class ForEachExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Mixail"), new StringBuilder("Ivan"), new StringBuilder("Elena"));
        List<StringBuilder> stringBuilders = names
                .stream()
                .peek((e) -> e.append("(Ycenik)"))
                .sorted()
                .toList();
        System.out.println(stringBuilders);
    }
}

