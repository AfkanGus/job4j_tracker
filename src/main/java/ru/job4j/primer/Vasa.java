package ru.job4j.primer;

public class Vasa {
    public void music(String slova) {
        System.out.println(" вася поет эти слова : " + slova);
    }

    public void muve(String tanec) {
        System.out.println(" вася танцует танец: " + tanec);
    }

    public void bit(int mnogoRaz) {
        if (mnogoRaz == 1) {
            System.out.println("Один нормаль");
        }
        if (mnogoRaz == 2) {
            System.out.println("два ниче так");
        } else if (mnogoRaz > 2 || mnogoRaz < 1) {
            System.out.println("Лучше не надо бить");
        }
    }

    public String danceToVals(String d) {
        return "Быстрый танец: " + d;
    }

    public static void main(String[] args) {
        Vasa vasy = new Vasa();
        String song = " я тебя люблю";
        String nogi = " Гопак";
        String dance = vasy.danceToVals("Брекданс");
        System.out.println(dance);
        vasy.music(song);
        vasy.muve(nogi);
        vasy.bit(1);
    }
}
