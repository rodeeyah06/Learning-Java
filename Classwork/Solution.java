package Classwork;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int addNumerals(String str){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int preValue = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            int current = map.get(str.charAt(i));
            if(current < preValue){
                total -= current;
            }else{
                total += current;
            }
            preValue = current;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(addNumerals("CXIX"));

    }
}
