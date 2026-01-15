package Semester2.Scheduling;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();

        Runnable runnable = ()-> booking.BookSeat(Thread.currentThread().getName());

        Thread thread = new Thread(runnable,"User A");
        Thread thread1 = new Thread(runnable,"User B");
        Thread thread2 = new Thread(runnable,"User C");

        thread.start();
        thread1.start();
        thread2.start();

    }
}
