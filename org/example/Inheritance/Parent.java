package org.example.Inheritance;

public class Parent {
    private String Name;
    private int Age;
    private String address;


    public static double netWorth(double netWorthOfCars, double netWorthOfHouses, double netWorthOfCompanies){
        return netWorthOfCars * netWorthOfHouses * netWorthOfCompanies;
    }


    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.Name = "Rodeeyah";
        p1.Age = 30;
        p1.address = " Ikeja";
        System.out.println(p1);
        System.out.println(Parent.netWorth(7889.00, 6790.89, 9089.00));


        Parent p2 = new Parent();
        p2.Name = "Maryam";
        p2.Age = 80;
        p2.address = "Surulere";
        System.out.println(p2);
        System.out.println(Parent.netWorth(67090.78, 789078.99, 7889067.99));
    }
}

