package Semester2.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private int id ;
    private String name;
    private double balance;
    private String type;

  public Customer(int id, String name, double balance, String type) {
      this.id = id;
      this.name = name;
      this.balance = balance;
      this.type = type;
  }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer(1,"Chidera",200.00,"Credit"),
                new Customer(2,"James",2000000.88,"Debit"),
                new Customer(3,"Feranmi",309000.6,"Debit"),
                new Customer(5,"Daniel",670098.2,"Credit"),
                new Customer(6,"Daniel",670098.2,"Debit")
        );
        customers.stream()
                .filter(c->c.getBalance()>200000)
                .forEach(c -> System.out.println(c));
       //customers.forEach(System.out::println);

    }
}
