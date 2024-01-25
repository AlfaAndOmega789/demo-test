package homework.homework_33.mvc;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

class Student{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface ModelLayer{
    Student getStudent();
}
class DBLayer implements ModelLayer{
    @Override
    public Student getStudent() {
        return new Student();
    }
}
class FileSystem implements ModelLayer{
    @Override
    public Student getStudent() {
        return new Student();
    }
}
interface View{
    void showStudent(Student student);
}
class ConsoleView implements View{
    @Override
    public void showStudent(Student student) {
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getAge() = " + student.getAge());
    }
}
class Controller{
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleView();
    void execute(){
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}