package org.example.classwork2;

public class Principal extends Person {
    public Principal(String name, int age, String id) {
        super(name, age, id);
    }
    public void admittedApplicants(Applicants applicant) {
        if(applicant.getAge()>= 16){
            System.out.println("You are admitted");
        }else{
            System.out.println("You are not admitted");
        }
    }
    public void Expel(int Offence){
        if(Offence >= 3){
            System.out.println(name +" "+ "Has expelled you");
        }else
            System.out.println("You have not been expelled");
    }
}

