package ru.job4j.map;

import ru.job4j.map.Student;
import ru.job4j.map.Subject;

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
     * @param - students.keySet() - метов вернет значения у students в виде Set.
     * @param -student.getAccount().equals(account) - получаем у student account и equals сравнивает
     * ссыллки на account если true то метод вернет student
     * @return - null - вернет пустую ссылку.
     */
    public Student findByAccount(String account) {
        for (Student student : students.keySet()) {
            if (student.getAccount().equals(account)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Метод - findBySubjectName - поиск предмета -Subject, по аккаунту и названию
     * @param account - аккаунт студента
     * @param name - название прдемета.
     * @param - s.getName().equals(name) - получим название прдмета и сравним его ссылки
     * @return - s - вернем название предмета если true
     * @return - null - ссылка на предмет отсутствует
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
