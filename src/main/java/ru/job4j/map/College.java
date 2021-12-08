package ru.job4j.map;

import java.util.Map;
import java.util.Set;
import java.util.Optional;

/**
 * Class College - колледж, где ищется студент по аккаунту, и предмет по аккуанту и названии
 * import java.util.Optional - класс обертка на null
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
     * @return - student - вернет пустую ссылку.
     */
    public Optional<Student> findByAccount(String account) {
        Optional<Student> student = students.keySet()
                .stream()
                .filter(s -> s.getAccount().equals(account))
                .findFirst();
        return student;
    }

    /**
     * Метод - findBySubjectName - поиск предмета -Subject, по аккаунту и названию
     * @ Optional.empty() - метод, что бы обернуть null
     * @ student.isPresent() - проверка, что объект не null
     * @ studentA.get() - получаем значение объекта
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> studentA = findByAccount(account);
        if (studentA.isPresent()) {
            Optional<Subject> subject = students.get(studentA.get())
                    .stream()
                    .filter(s -> s.getName().equals(name))
                    .findFirst();
            return subject;

        }
        return Optional.empty();
    }

   public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Optional<Student> student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Optional<Subject> english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.get().getScore());

    }
}
