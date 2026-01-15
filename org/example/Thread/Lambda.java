package org.example.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(5,67,5));
        System.out.println(num);
//        for (int i = 0; i < num.size(); i++) {
//            System.out.println(num.get(i));

            Consumer<Integer> consumer = (a) -> System.out.println(a);
            num.forEach(consumer);

            int random = (int) (Math.random() * 100);
            System.out.println(random);



            }
        }



