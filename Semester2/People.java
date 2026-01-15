package Semester2;

public class People {
   private String Name;
   private int Age;
   private String Complexion;
   private String Height;

    @Override
    public String toString() {
        return "People{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Complexion='" + Complexion + '\'' +
                ", Height='" + Height + '\'' +
                '}';
    }

    public static void main(String[] args) {
        People p = new People();
        p.Name = "Sarah";
        p.Age = 17;
        p.Complexion = "Dark";
        p.Height = "Tall";
        System.out.println(p);

        People p2 = new People();
        p2.Name = "Chidera";
        p2.Age = 18;
        p2.Complexion = "Fair";
        p2.Height = "Tall";
        System.out.println(p2);

        People p3 = new People();
        p3.Name = "Emma";
        p3.Age = 19;
        p3.Complexion = "Dark";
        p3.Height = "Tall";
        System.out.println(p3);

    }
}
