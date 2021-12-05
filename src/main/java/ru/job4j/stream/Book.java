package ru.job4j.stream;

public class Book {
    private String name;
    private String author;
    private int price;
    private int page;
    private boolean useful;
    private double weight;

    @Override
    public String toString() {
        return "Book{"
                + "name = '" + name + '\'' + ", author = '"
                + author + '\''
                + ", price = " + price + " руб" + ", page = "
                + page + " стр." + ", useful = " + useful
                + ", weight = " + weight + " грамм " + '}';
    }

    static class Builder {
        private String name;
        private String author;
        private int price;
        private int page;
        private boolean useful;
        private double weight;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildAuthor(String author) {
            this.author = author;
            return this;
        }

        Builder buildPrice(int price) {
            this.price = price;
            return this;
        }

        Builder buildPage(int page) {
            this.page = page;
            return this;
        }

        Builder buildUseful(Boolean useful) {
            this.useful = useful;
            return this;
        }

        Builder buildWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        Book build() {
            Book book = new Book();
            book.name = name;
            book.author = author;
            book.price = price;
            book.page = page;
            book.useful = useful;
            book.weight = weight;
            return book;
        }
    }

    public static void main(String[] args) {
        Book book = new Builder().buildName("Грокаем лагоритмы")
                .buildAuthor("Адатия Бхаргава")
                .buildPage(300)
                .buildPrice(1000)
                .buildUseful(true)
                .buildWeight(400.5)
                .build();
        System.out.println(book);
    }
}
