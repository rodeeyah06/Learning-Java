package Semester2.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int Output = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println(Output);
        String name = "IDRIS";
        String Name = "adejumo";

        System.out.println(name.toLowerCase());
        System.out.println(Name.toUpperCase());
    }
}
