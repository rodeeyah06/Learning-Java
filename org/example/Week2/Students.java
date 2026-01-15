package org.example.Week2;

public class Students {
   private String name;
   private int age;
    private String gender;
    private String address;

    public Students (){

    }
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public Students (String name,String address,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String learn(){
        return "Student is learning";
    }


    public static void main(String[] args) {
        Students s = new Students();
        s.name = "John";
        s.age = 25;
        s.gender = "male";
        s.address = "San Francisco";
        System.out.println(s);
        Students s2 = new Students();
        s2.name = "Jan";
        s2.age = 26;
        s2.gender = "female";
        s2.address = "San Francisco";
        System.out.println(s2);

        Students s3 = new Students("Rodeeyah","Surulere",30,"Female");
        System.out.println(s3);
    }
}
