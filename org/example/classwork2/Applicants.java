package org.example.classwork2;

public class Applicants extends Person {
    public Applicants(String name, int age, String id) {
        super(name, age, id);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getId(){

        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setId(String id){
        this.id = id;
    }
}
