package ru.job4j.oop;

public class JexeBox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Pust degut");
        }
        if (position == 2) {
            System.out.println("Spoki noki");
        } else if (position > 2 || position < 1) {
            System.out.println("pest nout");
        }
    }

    public static void main(String[] args) {
        JexeBox p = new JexeBox();
        p.music(1);
        p.music(2);
        p.music(0);

    }
}
