public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    public boolean matches(String query) {
        if (query.contains(subtasks))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
