package org.example;

public class Demo2 {
    public int JambScore(int Score) {
        if (Score >= 200) {
            System.out.println("University");
        }
        if (Score <= 180 && Score >= 150) {
            System.out.println("Polytecnic");
        }
        if (Score <= 150) {
            System.out.println("College");
        }
        return Score;
    }
    public  static void main(String[] args) {
        Demo2 demo = new Demo2();
        System.out.println(demo.JambScore(140));

    }
}



