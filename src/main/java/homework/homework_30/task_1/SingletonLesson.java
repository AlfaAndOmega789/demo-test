package homework.homework_30.task_1;

public class SingletonLesson {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
    }
}
class Singleton{
    private Singleton(){}
    static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }

}
