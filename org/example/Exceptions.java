package org.example;

public class Exceptions {
    public static void main(String[] args) {
//        try{
//            int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//            System.out.println(numbers[13]);
//        } catch (java.lang.Exception e) {
//            System.out.println("It is about the index range");
//            throw new RuntimeException("It is above");
//
//        }
        try{
            int a = 0;
            int b = 100;
            int c = b/a;
        } catch (ArithmeticException e) {
            throw new UserError("This is an exception");
        }

//
//
//        String a = "Aba";
//        try{
//            int values = Integer.parseInt(a);
//            System.out.println(values);
//        } catch (NumberFormatException e) {
//            System.out.println("Error in Converting " +e.getMessage());
//        }

//        try{
//            int a = 1 / 2;
//            System.out.println(a);
//            int [] Values = {9,8,0};
//            int ans = Values[9];
//        }catch (ArithmeticException e) {
//            System.out.println("Undefined" + e.getMessage());
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("I cannot find " + e.getMessage());
//        }

//        try{
//            String p = "Password";
//            String q = "Username";
//
//        } catch (Exception e) {
//            throw new UserError("Invalid username and password");
//        }



    }

}
