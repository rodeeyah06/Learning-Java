package org.example.FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File {
    public static void main(String[] args) {
        try{
            if (Files.exists(Paths.get("Ayo.txt"))) {
                FileWriter Write = new FileWriter("name.txt");
                Write.write("Rodeeyah");
                Write.close();
            }else {
               java.io.File file = new java.io.File("Rodeeyah.txt");
                file.createNewFile();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
