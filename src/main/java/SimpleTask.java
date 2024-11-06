public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }
    @Override
    public boolean matches(String query) {
        if (query.contains(title))
        {
            return true;
        }
        else {
            return false;
        }
    }
}