package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {
    public static String List(){
        List<String> list = new ArrayList<>();
        list.add("Faruq");
        list.add("Ayo");
        list.add("Malik");

        for (String string : list){
            System.out.println(string);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(List());
    }
}
