package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем студентов
        Student student1 = new Student("Иван Иванов", 1);
        Student student2 = new Student("Петр Петров", 2);

        // Создаем преподавателей
        Teacher teacher1 = new Teacher("Доктор Смит", 101);
        Teacher teacher2 = new Teacher("Профессор Джонс", 102);

        // Создаем курсы
        Course mathCourse = new Course("Математика");
        Course physicsCourse = new Course("Физика");

        // Назначаем преподавателей на курсы
        teacher1.assignCourse(mathCourse);
        teacher2.assignCourse(physicsCourse);

        // Записываем студентов на курсы
        student1.enrollInCourse(mathCourse);
        student2.enrollInCourse(physicsCourse);

        // Создаем группу и добавляем студентов
        Group group = new Group("Группа 101");
        group.addStudent(student1);
        group.addStudent(student2);

        // Создаем расписание и добавляем курсы
        Schedule schedule = new Schedule();
        schedule.addCourseToSchedule(mathCourse, "Понедельник", "10:00");
        schedule.addCourseToSchedule(physicsCourse, "Понедельник", "12:00");

        // Пытаемся добавить курс в занятое время
        schedule.addCourseToSchedule(mathCourse, "Понедельник", "10:00");

        // Выводим расписание
        schedule.printSchedule();

        // Выводим список студентов в группе
        group.printStudents();

        // Выводим курсы студента
        student1.printEnrolledCourses();

        // Выводим курсы преподавателя
        teacher1.printAssignedCourses();

        // Поиск курса по названию
        Course foundCourse = schedule.findCourseByName("Физика");
        if (foundCourse != null) {
            System.out.println("Найден курс: " + foundCourse.getName());
            foundCourse.printStudents();
        }
    }
}