import org.example.Course;
import org.example.Teacher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void testAssignCourse() {
        Teacher teacher = new Teacher("Доктор Смит", 101);
        Course course = new Course("Математика");

        teacher.assignCourse(course);

        assertEquals(1, teacher.getAssignedCourses().size());
        assertTrue(teacher.getAssignedCourses().contains(course));
    }

    @Test
    public void testPrintAssignedCourses() {
        Teacher teacher = new Teacher("Доктор Смит", 101);
        Course course1 = new Course("Математика");
        Course course2 = new Course("Физика");

        teacher.assignCourse(course1);
        teacher.assignCourse(course2);

        // Проверяем, что метод не выбрасывает исключений
        assertDoesNotThrow(teacher::printAssignedCourses);
    }
}