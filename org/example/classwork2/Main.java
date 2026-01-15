package org.example.classwork2;


public class Main {
    public static void main(String[] args) {
        Principal p = new Principal("Mr Emma",1,"001a");
        Applicants applicants= new Applicants("Chidera",13,"03s");
        Applicants applicants1 = new Applicants("Rodeeyah",18,"06a");

       Students students= new Students("Rodeeyah",18,"001a","Mathematics");
       Students students1 = new Students("Daniel",21,"069a","English");

        p.admittedApplicants(applicants);
        p.admittedApplicants(applicants1);

        Courses courses = new Courses("Mathematics","MtH101");
        Courses courses1 = new Courses("English","GNS101");

        Teachers teacher1 = new Teachers("Mrs Ese",54,"76ra");

       teacher1.teaching(courses);
       students.takeCourses(courses);
       p.Expel(9);
       students1.takeCourses(courses1);





    }

}
