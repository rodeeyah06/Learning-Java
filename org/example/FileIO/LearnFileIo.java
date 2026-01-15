package org.example.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LearnFileIo {
    public static void main(String[] args) {
       try{
           File file = new File ("name.txt");
           file.createNewFile();

           FileWriter writer = new FileWriter("name.txt");
           writer.write("Hello World");
           writer.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


    }
}
