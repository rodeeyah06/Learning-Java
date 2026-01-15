package Semester2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       nums.stream()
                .filter(num -> num % 2 == 0)
               .sorted()
                .map(num -> num * 2)
               .forEach(System.out::println);
        System.out.println(nums);

       //List<String>words = Arrays.asList("hello", "world", "hello", "world", "hello", "world", "hello", "world");
       //words.stream()
               //  .filter(n-> n.indexOf("world") > 0);
        //System.out.println(words);

       //nums.forEach(System.out::println);

       //System.out.println( nums.size());
      //Stream<Integer> stream = nums.stream();
      // Stream<Integer> multiply = stream.map(x -> x * 2);
     //  multiply.forEach(System.out::println);

       // long count = stream.count();
     //   System.out.println( count);

  // for (int i=0; i<nums.size(); i++) {
    //   System.out.println(nums.get(i)*2);
   // }
       //stream.forEach(System.out::println);
       //stream.forEach(System.out::println);
  //  }
//
}

}
