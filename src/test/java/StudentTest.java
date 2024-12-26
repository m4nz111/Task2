import org.example.Course;
import org.example.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testEnrollInCourse() {
        Student student = new Student("Иван Иванов", 1);
        Course course = new Course("Математика");

        student.enrollInCourse(course);

        assertEquals(1, student.getEnrolledCourses().size());
        assertTrue(student.getEnrolledCourses().contains(course));
    }

    @Test
    public void testPrintEnrolledCourses() {
        Student student = new Student("Иван Иванов", 1);
        Course course1 = new Course("Математика");
        Course course2 = new Course("Физика");

        student.enrollInCourse(course1);
        student.enrollInCourse(course2);

        // Проверяем, что метод не выбрасывает исключений
        assertDoesNotThrow(student::printEnrolledCourses);
    }
}