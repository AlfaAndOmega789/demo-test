package main.homework.homework_32.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    private int userIdDB;
    public User(int userIdDB) {
        this.userIdDB = userIdDB;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите userID");
        int userID = Integer.parseInt(reader.readLine());
        System.out.println("Выберете уровень клонирования объекта: " + "\n" + "1. Глубокое" + "\n" + "2. Поверхностое");
        int levelClone = Integer.parseInt(reader.readLine());
        User user = new User(123); //изменить

        if(userID == user.getUserIdDB()){
            if(1 == levelClone){

                //вытянуть id юзера из бд и сделать клонирование

            }
            if(2 == levelClone) {
                //вытянуть id юзера из бд и сделать клонирование
            }
        }
        else {
            System.out.println("User с таким ID не найден в базе данных!");
        }

        reader.close();
    }
    public int getUserIdDB() {
        return userIdDB;
    }
    public void setUserIdDB(int userIdDB) {
        this.userIdDB = userIdDB;
    }
}
