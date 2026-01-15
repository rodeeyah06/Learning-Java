package org.example;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {
    //input [3,5,3,2,5,6]
    // output [3,5,2,6]

      public static void duplicateRemove(List<Integer> list) {
          for (int i = 0; i<list.size(); i++) {
              Integer currentList = list.get(i);

              for (int j = i+1; j<list.size();) {
                  if (list.get(j).equals(currentList)) {
                      list.remove(j);
                  } else {
                      j++;
                  }
              }
          }
      }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);
        duplicateRemove(numbers);
        System.out.println(numbers);

    }
}
