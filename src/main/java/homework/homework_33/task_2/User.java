package homework.homework_33.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable{
    private int userIdDB;
    public User(int userIdDB) {
        this.userIdDB = userIdDB;
    }

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        List<User> userList = new ArrayList();
        userList.add(new User(1));
        userList.add(new User(2));
        userList.add(new User(3));


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите userID: ");
        int userID = Integer.parseInt(reader.readLine());
        System.out.println("Выберете уровень клонирования объекта: " + "\n" + "1. Глубокое" + "\n" + "2. Поверхностое");
        int levelClone = Integer.parseInt(reader.readLine());

        for(int i = 0; i < userList.size();i++){
            if(userID == userList.get(i).getUserIdDB()){
                if(1 == levelClone){
                    User newUser = userList.get(i).clone();
                    System.out.println(newUser);
                    //вытянуть id юзера из бд и сделать клонирование
                }
                if(2 == levelClone) {
                    //вытянуть id юзера из бд и сделать клонирование
                }
            }

        }

        for(User users : userList)
            System.out.println(users);

        reader.close();
    }
    public int getUserIdDB() {
        return userIdDB;
    }
    public void setUserIdDB(int userIdDB) {
        this.userIdDB = userIdDB;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = (User)super.clone();
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "userIdDB=" + userIdDB +
                '}';
    }
}
