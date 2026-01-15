package Classwork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> Words = Arrays.asList("John","Doe","Jane","John","Jaine");
        Words.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toLowerCase)
                .forEach(System.out::println);

    }

}
