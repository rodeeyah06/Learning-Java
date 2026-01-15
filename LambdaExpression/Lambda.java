package LambdaExpression;

public class Lambda {
    public static void main(String[] args) {
        MyFunctionalInterface greeting = () -> System.out.println("Welcome to Lambda");
        greeting.SayHi();
    }
}
