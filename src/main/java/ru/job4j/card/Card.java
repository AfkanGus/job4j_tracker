package ru.job4j.card;

import java.util.stream.Stream;

/**
 * Класс Card - где генирируется колода карт
 *
 * @param - Stream.of(Suit.values()) - метод получает поток из перечисления
 * @param - .flatMap(s -> Stream.of(Value.values())- каждое значение из потока Suit
 *          преобразуется в поток Value
 * @param - map(v -> new Card(s, v))) - метод map получил значения поля value и преобразовал его
 */
public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card {"
                + "suit = "
                + suit
                + ", value = "
                + value
                + '}';
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(s -> Stream.of(Value.values())
                        .map(v -> new Card(s, v)))
                .forEach(System.out::println);
    }
}
