package Classwork;

import java.util.ArrayList;
import java.util.List;

public class Number {

    public static boolean CheckNumber(List<Integer> number) {
        for (int i = 0; i < number.size(); i++) {
            List<Integer> currentList = number;
            for (int j = i +1; j < number.size();) {
                if (number == currentList) {
                    return true;
                } else {
                    j++;
                }
            }
        }

        return false;
    }



    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);

        System.out.println(CheckNumber(numbers));
    }
}
