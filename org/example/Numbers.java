package org.example;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(9);
        integers.add(2);
        integers.add(1);
        integers.add(3);
        System.out.println(integers);
        integers.remove(2);
        System.out.println(integers);
        System.out.println(integers.get(1));

        List<String> Words = new ArrayList<>();
        Words.add("Java");
        Words.add("C#");
        Words.add("JavaScript");
        Words.add("React");
        System.out.println(Words);
        Words.set(2, ".Net");
        System.out.println(Words);

        Map<Integer, String> map = new HashMap<>();
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        System.out.println(map.get(5));





    }
}
