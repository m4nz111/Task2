import org.example.Course;
import org.example.Schedule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScheduleTest {

    @Test
    public void testAddCourseToSchedule() {
        Schedule schedule = new Schedule();
        Course course = new Course("Математика");

        schedule.addCourseToSchedule(course, "Понедельник", "10:00");

        assertEquals(1, schedule.getSchedule().size());
        assertTrue(schedule.getSchedule().get("Понедельник").containsKey("10:00"));
    }

    @Test
    public void testIsTimeSlotAvailable() {
        Schedule schedule = new Schedule();
        Course course = new Course("Математика");

        schedule.addCourseToSchedule(course, "Понедельник", "10:00");

        assertFalse(schedule.isTimeSlotAvailable("Понедельник", "10:00"));
        assertTrue(schedule.isTimeSlotAvailable("Понедельник", "12:00"));
    }

    @Test
    public void testFindCourseByName() {
        Schedule schedule = new Schedule();
        Course course1 = new Course("Математика");
        Course course2 = new Course("Физика");

        schedule.addCourseToSchedule(course1, "Понедельник", "10:00");
        schedule.addCourseToSchedule(course2, "Понедельник", "12:00");

        assertEquals(course1, schedule.findCourseByName("Математика"));
        assertEquals(course2, schedule.findCourseByName("Физика"));
        assertNull(schedule.findCourseByName("Химия"));
    }

    @Test
    public void testPrintSchedule() {
        Schedule schedule = new Schedule();
        Course course = new Course("Математика");

        schedule.addCourseToSchedule(course, "Понедельник", "10:00");

        // Проверяем, что метод не выбрасывает исключений
        assertDoesNotThrow(schedule::printSchedule);
    }
}