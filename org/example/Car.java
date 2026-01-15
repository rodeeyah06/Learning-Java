package org.example;

public class Car {
    String name;
    String model;
    String color;
    int gear;


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", gear=" + gear +
                '}';
    }

    public static void main(String[] args) {
    Car car = new Car();
    car.name = "Rolls Royce";
    car.model = "R20";
    car.color = "Purple";
    car.gear = 1;
    System.out.println(car);
    Car car2 = new Car();
    car2.name = "BMW";
    car2.model = "B20";
    car2.color = "Pink";
    car2.gear = 2;
    System.out.println(car2);

}
}
