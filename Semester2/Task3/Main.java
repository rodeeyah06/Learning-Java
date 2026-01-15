package Semester2.Task3;

public class Main {
    public static void process(String input, StringProcess process) {
        System.out.println(process.processString(input));
    }
    public static void main(String[] args) {
        process("CHISOM", q->q.toLowerCase());
        process("ade", q->q.toUpperCase());
    }
}
