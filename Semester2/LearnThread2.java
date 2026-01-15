package Semester2;

public class LearnThread2 implements Runnable {

    public static void main(String[] args) {
        LearnThread2 t2 = new LearnThread2();
      Thread t = new Thread(t2);
        t.start();
    }
    @Override
    public void run() {
        System.out.println("Thread is running");

    }
}
