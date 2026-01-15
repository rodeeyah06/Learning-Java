package Semester2.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Classwork {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali","John","Angela","Ade");


        List<String> Output = names.stream().filter(name ->name.startsWith("A")).toList();
        System.out.println(Output);
    }

}
