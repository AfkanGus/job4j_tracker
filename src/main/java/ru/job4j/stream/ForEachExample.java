package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * peek() - это промежуточная операция. Выполняет действие для каждого
 * элемента потока, возвращая поток, состоящий из
 * измененных элементов.
 * <p>
 * forEach() - это конечная операция. Выполняет действие для каждого
 * элемента потока, завершая поток.
 */
public class ForEachExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("odin", "Dva", "Tri");
        stringList.stream() /*создаем стрим из листа*/
                .map(String::toLowerCase) /*добавляем промежуточную информацию понижение регистра*/
                .forEach(System.out::println); /*печатаем каждый измененный объект и закрывает поток*/
    }
}

