package main.homework.homework_23.task_1;

public class ProxyLesson {
    public static void main(String[] args) {
        CarI carI = new CarProxy();
        carI.drive();
    }
}

interface CarI{
    void drive();
}
class CarProxy implements CarI {
    CarI carI = new Reno();

    @Override
    public void drive() {
        System.out.println("Proxy Code!");
        carI.drive();
    }
}
class Reno implements CarI{
    @Override
    public void drive() {
        System.out.println("Drive Reno!");
    }
}