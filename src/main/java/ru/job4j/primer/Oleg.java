package ru.job4j.primer;

/*Вызов метода с аргументами*/
public class Oleg {

    public void music(String lyrics) {
        System.out.println("Love is: " + lyrics);
    }

    /*Метод с возвращающимся типом*/
    public String returnVoid(String d) {
        return "My Love is You: " + d;
    }

    public String retVoid() {
        String voice = " E";
        return voice;
    }

    public static void main(String[] args) {
        Oleg oleg = new Oleg();
        String song = "Life";
        oleg.music(song);

        String you = oleg.returnVoid("It is true");
        System.out.println(you);

        String i = oleg.retVoid();
        System.out.println(" O" + i);

    }
}
