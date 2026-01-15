package Nurudeen;


import static Nurudeen.Practice.Multiply;

public class Nurudeen2 {
    String name;
    String Complexion;
    int age;
    int height;

    @Override
    public String toString() {
        return "Nurudeen2{" +
                "name='" + name + '\'' +
                ", Complexion='" + Complexion + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {

        Multiply( 7,97,7);
//        Instantiation of a class
        Nurudeen2 N = new Nurudeen2();

        N.name = "Nurudeen";
        N.Complexion = "Fair";
        N.age = 25;
        N.height = 4;

        System.out.println(N.name);







    }

    }

