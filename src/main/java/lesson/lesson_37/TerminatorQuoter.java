package lesson.lesson_37;

public class TerminatorQuoter implements Quoter{
    public String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
