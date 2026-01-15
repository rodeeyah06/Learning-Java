package Semester2.Task3;

import org.example.classwork2.Students;

import java.util.Arrays;
import java.util.List;

public class Aptech {
    private String Department;
   private String Name;
   private int amount;

   public Aptech(String Department, String Name, int amount) {
       this.Department = Department;
       this.Name = Name;
       this.amount = amount;
   }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Aptech{" +
                "Department='" + Department + '\'' +
                ", Name='" + Name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        List<Aptech> student = Arrays.asList(
                new Aptech("ADSE","Alameen",400000),
                new Aptech("ADSE","Abdullah",56000),
                new Aptech ("ADSE","Rodeeyah",300000),
                new Aptech("ADSE","Nurudeen",100007),
                new Aptech ("CyberSecurity","Abdul",300000),
                new Aptech ("CyberSecurity","Destiny",49000),
                new Aptech ("CyberSecurity","Funmi",39000),
                new Aptech("Multimedia","Tayo",98000),
                new Aptech("Multimedia","Yomi",60000),
                new Aptech("Multimedia","Lola",500000)
        );
        student.stream()
                .filter(c->c.getAmount()<200000)
                .filter(p->p.getDepartment().equals("ADSE "))
                .forEach(System.out::println);
        System.out.println("Your School fees needs Update");
    }
}
