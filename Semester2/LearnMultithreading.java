package Semester2;

public class LearnMultithreading implements Runnable  {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        LearnMultithreading multi = new LearnMultithreading();
        multi.run();
    }

}
