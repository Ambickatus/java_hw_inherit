import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void shouldFindEpic() {
        String[] subtasks = {"Поесть", "Попить", "Поспать"};
        Epic epicTask = new Epic(1, subtasks);

        Assertions.assertEquals(true, epicTask.matches("Попить"));

    }

    @Test
    public void shouldNotFindEpic() {
        String[] subtasks = {"Поесть", "Попить", "Поспать"};
        Epic epicTask = new Epic(1, subtasks);

        Assertions.assertEquals(false, epicTask.matches("Лечить"));

    }

    @Test
    public void shouldFindMeetingProject() {
        Meeting meetingTask = new Meeting(2, "Встреча", "Основной", "Завтра");

        Assertions.assertEquals(true, meetingTask.matches("Основной"));
    }

    @Test
    public void shouldFindMeetingTopic() {
        Meeting meetingTask = new Meeting(2, "Встреча", "Основной", "Завтра");

        Assertions.assertEquals(true, meetingTask.matches("Встреча"));
    }

    @Test
    public void shouldNotFindMeetingStart() {
        Meeting meetingTask = new Meeting(2, "Встреча", "Основной", "Завтра");

        Assertions.assertEquals(false, meetingTask.matches("Завтра"));
    }

    @Test
    public void shouldFindSimpleTaskTopic() {
        SimpleTask simpleTask = new SimpleTask(10, "Найти решение");

        Assertions.assertEquals(true, simpleTask.matches("Найти решение"));
    }

    @Test
    public void shouldNotFindSimpleTaskTopic() {
        SimpleTask simpleTask = new SimpleTask(10, "Найти решение");

        Assertions.assertEquals(false, simpleTask.matches("Найти печеньку"));
    }
}
