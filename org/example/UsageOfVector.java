package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class UsageOfVector {
    public static void main(String[] args) {
        Vector<String> Name = new Vector<>();
        Name.add("Ram");
        Name.add("Goat");
        Name.add("Camel");
        Name.add("Cow");
        Name.set(1,"Cat");
        Name.remove(3);
        System.out.println(Name);

        Stack<String> stack = new Stack<>();
        stack.push("Tecno");
        stack.push("iPhone");
        stack.push("Samsung");
        stack.push("Redmi");
        stack.push("Infinix");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        Queue<String> queue = new LinkedList<>();
        queue.add("Tecno");
        queue.add("iPhone");
        queue.add("Samsung");
        queue.add("Redmi");
        queue.add("Infinix");
        System.out.println(queue);




    }


}
