package Semester2.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        List<Task3> task = Arrays.asList(
                new Task3("Roqeeb",18),
        new Task3("Mary",24),
        new Task3("John",85)
        );

      task.sort(Comparator.comparingInt(p -> p.age));
      task.forEach(System.out::println);
    }

}
