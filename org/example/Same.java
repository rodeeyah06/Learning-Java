package org.example;

import java.util.ArrayList;
import java.util.List;

public class Same {

        public static List<String> findSameIndex(List<String> words) {

            List<String> Index = new ArrayList<>();
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (sameIndex(word)) {
                    Index.add(word);
                }
            }

            return Index;
        }
        private  static  boolean sameIndex(String word) {
            int left = 0;
            int right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left) == word.charAt(right)) {
                    return true;
                }
                left++;
                right--;
            }
            return false;
        }

        public static void main(String[] args) {
            List<String> words = new ArrayList<>(List.of("aja","tade", "tunji","barb"));
            System.out.println(findSameIndex(words));
        }
    }