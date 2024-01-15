package homework.homework_30.task_5;

public class PrototypeLesson { //любой объект который умеет клонировать себя
    public void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        person.setStudent(new Student());

        Student student = person.getStudent();
    }
    class Student implements Cloneable{
        @Override
        protected Student clone() throws CloneNotSupportedException {
            return (Student)super.clone();
        }
    }
    class Person{
        private Student student;
        public Student getStudent() throws CloneNotSupportedException{
            return student.clone();
        }
        public void setStudent(Student student){
            this.student = student;
        }
    }
}
