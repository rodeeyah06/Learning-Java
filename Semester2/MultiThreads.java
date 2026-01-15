package Semester2;

public class MultiThreads extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        MultiThread m = new MultiThread();
        m.start();
        System.out.println(amount);


        amount ++;
        System.out.println(amount);
    }
    public void run() {
        amount ++;
    }
}
