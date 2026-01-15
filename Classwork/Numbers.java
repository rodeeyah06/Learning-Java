package Classwork;

public class Numbers {
    int number;

    public Numbers(int i) {
    }

    public static void Even(int num,int num2) {
        if (num % 2 == 0){
            System.out.println(num);
        }else{
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        Even(10,7);
    }

}
