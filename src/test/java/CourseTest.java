import org.example.Course;
import org.example.Student;
import org.example.Teacher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    public void testAddStudent() {
        Course course = new Course("Математика");
        Student student = new Student("Иван Иванов", 1);

        course.addStudent(student);

        assertEquals(1, course.getStudents().size());
        assertTrue(course.getStudents().contains(student));
    }

    @Test
    public void testSetTeacher() {
        Course course = new Course("Математика");
        Teacher teacher = new Teacher("Доктор Смит", 101);

        course.setTeacher(teacher);

        assertEquals(teacher, course.getTeacher());
    }

    @Test
    public void testPrintStudents() {
        Course course = new Course("Математика");
        Student student1 = new Student("Иван Иванов", 1);
        Student student2 = new Student("Петр Петров", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        // Проверяем, что метод не выбрасывает исключений
        assertDoesNotThrow(course::printStudents);
    }
}