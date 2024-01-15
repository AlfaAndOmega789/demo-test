package homework.homework_29.single_responsibility;

public class Person {
    /**
     * Single Responsibility Principle — принцип единственной ответственности.
     */

    /**
     * Основной смысл принципа в том,
     * чтоб в  классе была только одна причина для расширения,
     * к примеру видов готовки есть мн-во, так и стилей/видов рисования,
     * отсюда следует, что если все будет в одном классе, то произойдет переполненность,
     * и дополнительное усложнение логики.
     */
    public void cook(){}
    public void paint(){}
    public void drive(){}
    public void cutTheGrass(){}
}
