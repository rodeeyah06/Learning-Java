package Semester2.Scheduling;

public class Booking {
    private int availableSeats = 2;

    public synchronized void BookSeat(String name ){
         if (availableSeats> 0) {
            System.out.println(name +" "+ "is booking a seat");
            availableSeats--;

            System.out.println(name +" "+ "Has successfully booked"+ " "+ availableSeats + " "+ "Left");
        }else if (availableSeats == 0){
             System.out.println(name + " " + " No seats available");
         }
    }
}
