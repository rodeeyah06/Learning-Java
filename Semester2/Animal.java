package Semester2;

public class Animal implements Sound {
    String Name;

    public Animal(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                '}';
    }

    @Override

    public  void Eat() {

    }
}

