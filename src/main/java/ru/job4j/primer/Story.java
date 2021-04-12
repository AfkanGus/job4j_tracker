package ru.job4j.primer;

public class Story {
    public static void main(String[] args) {
        Pioneer perya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(perya);
        wolf.eat(girl);
        perya.kill(wolf);

    }
}
