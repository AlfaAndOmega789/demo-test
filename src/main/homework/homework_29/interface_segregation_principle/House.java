package main.homework.homework_29.interface_segregation_principle;

public class House implements Build{
    /**
     * Interface Segregation Principle — принцип разделения интерфейсов
     * Необходимо избегать зависимости от того, что не используется.
     */
    @Override
    public void buildWall() {
        System.out.println("Building a wall");
    }

    @Override
    public void buildHouse() {
        System.out.println("Building a house");
    }

    @Override
    public void buildFence() {
        //не реализуем
    }
}
