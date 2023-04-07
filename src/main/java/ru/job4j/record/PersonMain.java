package ru.job4j.record;

/**
 * Person = new Person("Иван", 30)
 * System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
 * System.out.println(person);
 */
public class PersonMain {
    public static void main(String[] args) {
        PersonRecord record = new PersonRecord("Иван", 30);
        /*
         * Если всё же нужно изменить поле, то потребуется создать новый объект record,
         * скопировать в него значения полей, которые не менялись, и указать новое значение
         * в поле, которое нужно изменить
         */
        PersonRecord newRecord = new PersonRecord(record.name(), 35);
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        /*
         * создаем еще один record с теми же полями и значениями и сравниваем их,
         * в результате чего получаем true, то есть hashcode и equals в
         * record тоже переопределены.
         */
        PersonRecord record1 = new PersonRecord("Иван", 30);
        System.out.println(record.equals(record1));
    }
}
