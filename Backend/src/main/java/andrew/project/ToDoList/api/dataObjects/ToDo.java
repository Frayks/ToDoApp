package andrew.project.ToDoList.api.dataObjects;

public class ToDo {
    String id;
    String text;
    boolean done;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", done=" + done +
                '}';
    }
}
