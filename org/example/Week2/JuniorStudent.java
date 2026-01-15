package org.example.Week2;

public class JuniorStudent extends Students{
    public JuniorStudent() {
    }

    public JuniorStudent(String name, String address, int age, String gender) {
        super(name, address, age, gender);
    }

    public String learn(){
        return " The Junior Student is learning Coding";

    }


}
