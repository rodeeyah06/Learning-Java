package LambdaExpression;

public class SolveMathOperation {
    public static void main(String[] args) {
        MathOperation mathOperation = (a, b) -> a * b;
        System.out.println(mathOperation.Area(2, 3));
    }
}
