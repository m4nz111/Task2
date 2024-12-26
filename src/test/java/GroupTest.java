import org.example.Group;
import org.example.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroupTest {

    @Test
    public void testAddStudent() {
        Group group = new Group("Группа 101");
        Student student = new Student("Иван Иванов", 1);

        group.addStudent(student);

        assertEquals(1, group.getStudents().size());
        assertTrue(group.getStudents().contains(student));
    }

    @Test
    public void testPrintStudents() {
        Group group = new Group("Группа 101");
        Student student1 = new Student("Иван Иванов", 1);
        Student student2 = new Student("Петр Петров", 2);

        group.addStudent(student1);
        group.addStudent(student2);

        // Проверяем, что метод не выбрасывает исключений
        assertDoesNotThrow(group::printStudents);
    }
}