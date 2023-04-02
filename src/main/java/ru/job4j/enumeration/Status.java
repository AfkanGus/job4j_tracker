package ru.job4j.enumeration;

/**
 * 12. Enum  [#504960].
 * Enum - это класс-перечисление. Перечисление - это набор констант,
 * связанных между собой по смыслу. Константы здесь - это статические объекты,
 * создающиеся в единственном экземпляре.
 * Перечисление может содержать поля, методы и конструкторы.
 * Добавим в перечисление поле info, создадим конструктор, принимающий это поле,
 * и геттер, чтобы получать значение поля info.
 */
public enum Status {
    /**
     * Так как каждое значение перечисления - это объект анонимного класса,
     * то в нём можно объявлять свои методы:
     */
    ACCEPTED("Принят") {
        private String message = "Автомобиль принят на СТО";

        @Override
        public String getMessage() {
            return message;
        }
    },
    IN_WORK("В работе") {
        private String message = "Автомобиль в работе";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING("Ожидание") {
        private String message = "Автомобиль ожидает запчасти";

        @Override
        public String getMessage() {
            return message;
        }
    },
    FINISHED("Работы завершены") {
        private String message = "Все работы завершены";

        @Override
        public String getMessage() {
            return message;
        }
    };

    private String info;

    /**
     * В нашем коде конструктор в перечислении неявно имеет модификатор private.
     */
    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    /**
     * Сначала в перечисление Status мы добавили абстрактный метод getMessage(),
     * который обязывает каждое значение перечисления переопределить этот метод:
     */
    public abstract String getMessage();

}
