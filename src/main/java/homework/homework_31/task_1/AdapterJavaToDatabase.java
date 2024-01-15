package homework.homework_31.task_1;

public class AdapterJavaToDatabase extends JavaApplication implements Database{
    @Override
    public void insert() {
        saveObject();
    }
    @Override
    public void remove() {
        removeObject();
    }
    @Override
    public void select() {
        selectObject();
    }
    @Override
    public void update() {
        updateObject();
    }
}
