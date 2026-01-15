package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
        public static List<String> findpalindromes(List<String> words) {

            List<String> palindromes = new ArrayList<>();
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (isPalindrome(word)) {
                    palindromes.add(word);
                }
            }

            return palindromes;
        }
        private  static  boolean isPalindrome(String word) {
            int left = 0;
            int right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            List<String> words = new ArrayList<>(List.of("madam","code", "level","world","noon"));
//       words.add("madam");
//        words.add("code");
//        words.add("level");
//        words.add("world");
//        words.add("noon");
            System.out.println(findpalindromes(words));
        }

}
