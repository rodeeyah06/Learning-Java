package org.example.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
//        try{
//            File file = new File("name.txt");
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()) {
//                String scan = scanner.nextLine();
//                System.out.println(scan);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        try {
            if (Files.exists(Paths.get("name.txt"))) {
                Files.delete(Paths.get("name.txt"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String name = "Sarah";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
        System.out.println("\n");
        System.out.println(name.length());
        System.out.println("\n");

        int [] numbers = {56,81,1,4,7};
        System.out.println(Arrays.stream(numbers).min().getAsInt());

    }
}
