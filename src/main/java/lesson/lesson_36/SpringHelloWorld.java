package lesson.lesson_36;

public class SpringHelloWorld {
    private String helloMessage;
    public void getHelloMessage() {
        System.out.println("Hello world: " + helloMessage);
    }
    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
}
