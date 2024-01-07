package main.homework.homework_23.task_1;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String clientsSystem;

    public User(int id, String name, String clientsSystem){
        this.id = id;
        this.name = name;
        this.clientsSystem = clientsSystem;
    }

    public static void main(String[] args) {
        User first = new User(1, "Ivan", "1111");
        User second = new User(1, "Ivan", "1111");
        User third = new User(1, "Ivan", "1111");

        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(clientsSystem, user.clientsSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, clientsSystem);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", systemClient='" + clientsSystem + '\'' +
                '}';
    }
}
