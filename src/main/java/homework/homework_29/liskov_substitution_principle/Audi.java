package homework.homework_29.liskov_substitution_principle;

public class Audi implements Move{
    /**
     * Для создания взаимозаменяемых частей эти части должны соответствовать контракту,
     * который позволяет заменять эти части друг другом.
     */

    public static void main(String[] args) {
        Audi audi = new Audi();
        Transport transport = new Car();

        audi.move(new Car());
    }
    @Override
    public void move(Transport transport) {
        System.out.println("Audi");
    }
}
