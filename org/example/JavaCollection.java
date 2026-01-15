package org.example;

import java.util.*;

public class JavaCollection {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("chisom girl");
        students.add("chisom boy");
        students.add("chibuzor");
        students.add("chibuzor");
        System.out.println(students);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        Collections.sort(numbers);
        System.out.println(numbers);

        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(4);
        System.out.println(integers);
        System.out.println(numbers.toArray().length);


    }

}




