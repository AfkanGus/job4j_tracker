package ru.job4j.primer;

/*Поля объекта*/
public class Cati {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(" my perfact food : " + this.food);
        System.out.println(" my name is: " + this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cati gav = new Cati();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food");
        Cati black = new Cati();
        black.giveNick("Fuck");
        black.eat("fish");
        black.show();
    }
}

