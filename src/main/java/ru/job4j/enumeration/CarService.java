package ru.job4j.enumeration;

/**
 * Теперь мы можем создавать переменные типа Status и применять их.
 */
public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar()
                + ", статус ремонта: " + order.getStatus().getInfo() + ", подробности: "
                + order.getStatus().getMessage());

        Status[] statuses = Status.values();
        for (Status s : statuses) {
            /**
             * - name() - возвращает имя константы (значения) в том же виде, в каком оно объявлено.
             * - ordinal() - возвращает порядковый номер константы (значения), по которому
             * её экземпляр находится в перечислении (нумерация с нуля).
             */
            System.out.println("Название статуса: " + s.name()
                    + ", Порядковый номер статуса: " + s.ordinal());
        }
        /**
         *  valueOf() - получает объект типа класса перечисления по его строковому представлению.
         */
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
/**
 * Также, так как значения enum не меняются, то при работе с ними можно использовать оператор switch
 */
        switch (status) {
            case ACCEPTED:
                System.out.println("Статус: Автомобиль принят на СТО");
                break;
            case IN_WORK:
                System.out.println("Статус: Автомобиль в работе");
                break;
            case WAITING:
                System.out.println("Статус: Автомобиль ожидает запчасти");
                break;
            case FINISHED:
                System.out.println("Статус: Все работы завершены");
                break;
            default:
        }
    }
}
