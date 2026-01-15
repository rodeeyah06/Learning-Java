package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int age = 30,temperature =20;
        age = age + 1;
        String Car = "bently";
        String HerCar = Car;
        System.out.println(Car);
        Date now = new Date();
        System.out.println(now);
        byte x = 1;
        byte y = x;
        x=2;
        System.out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String message = "Hello \"\nWorld\"" + "!!";

        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

    }
}


