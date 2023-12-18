package main.homework.homework_29.open_closed_principle;

public class Cat extends Animal implements Move{
    @Override
    public void run() {
        System.out.println("The cat is running");
    }
    @Override
    public void walk() {
        System.out.println("The cat is walking");
    }
}
