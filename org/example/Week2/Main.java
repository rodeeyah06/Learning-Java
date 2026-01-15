package org.example.Week2;

public class Main {
    public static void main(String[] args) {
        JuniorStudent js = new JuniorStudent("Maryam","Ikeja",10,"Female");
        System.out.println(js);
        Students s = new Students("Rodeeyah","Surulere",30,"Female");
        System.out.println(s);
        System.out.println(s.learn());
        System.out.println(js.learn());

    }
}
