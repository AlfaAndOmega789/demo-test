package homework.homework_29.dependecy_inversion_principle;

public class Tom extends Male implements Move{

    /**
     * Код, реализующий высокоуровневую политику, не должен зависеть от кода,
     * реализующего низкоуровневые детали. Зависимости должны быть направлены на абстракции, а не на реализации.
     */
    public static void main(String[] args) {
        Tom tom = new Tom();
        Male male = tom;
        tom.move(male);
    }

    @Override
    public void move(Person person) {

    }
}
