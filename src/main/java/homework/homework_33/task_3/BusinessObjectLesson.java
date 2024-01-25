package homework.homework_33.task_3;

public class BusinessObjectLesson {
    public static void main(String[] args) {
        BO bo = new BO();
        System.out.println(bo.getUser().getName());
    }
}
//transfer object
class User{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class ServiceEJB{
    public User getUser(){
        User user = new User();
        user.setName("Max");
        return user;
    }
}
class BO{
    ServiceEJB serviceEJB = new ServiceEJB();
    public User getUser(){
        return serviceEJB.getUser();
    }
}