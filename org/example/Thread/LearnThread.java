package org.example.Thread;

public class LearnThread implements Runnable {
    public static void main(String[] args) {
        LearnThread thread = new LearnThread();
        System.out.println("This Code is running on thread");
        thread.run();

    }


    public void run() {
        System.out.println("Start running thread");
    }


}
