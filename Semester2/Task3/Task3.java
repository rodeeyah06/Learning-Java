package Semester2.Task3;

public class Task3 {
    String name;
    int age;

   public Task3(String name, int age) {
       this.name = name;
       this.age = age;
   }


    @Override
    public String toString() {
        return "Task3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
