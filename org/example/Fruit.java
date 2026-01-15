package org.example;

public class Fruit {
    String name;
    String color;


   public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "Mango";
        fruit.color = "Yellow";
        System.out.println(fruit);

        Fruit fruit2 = new Fruit();
        fruit2.name = "Pinapple";
        fruit2.color = "Green";
        System.out.println(fruit2);

        Fruit fruit3 = new Fruit();
        fruit3.name = "Apple";
        fruit3.color = "Red";
        System.out.println(fruit3);

    }
}

