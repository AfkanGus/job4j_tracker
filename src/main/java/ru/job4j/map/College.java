package ru.job4j.map;

import java.util.Map;
import java.util.Set;

/**
 * Class College - колледж, где ищется студент по аккаунту, и предмет по аккуанту и названии
 */
public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Метод -findByAccount - поиска студента - Student,по аккаунту(String account),
     *
     * @param - students.keySet() - метод вернет значения в виде коллекции Set и предает в stream()
     * @param - .filter(s -> s.getAccount().equals(account)) - фильтрует stream,if return true
     * @param - .findFirst() - метод возвращает результат в виде объекта типа Optional
     * @param - .orElse() -возвращает значение если в объекте Optional есть значение,
     * @return - null - вернет пустую ссылку.
     */
    public Student findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод - findBySubjectName - поиск предмета -Subject, по аккаунту и названию
     */
    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            Set<Subject> subjects = students.get(a);
            for (Subject s : subjects) {
                if (s.getName().equals(name)) {
                    return s;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.getScore());

    }
}
