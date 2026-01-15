package org.example.classwork2;

import org.example.Example.School;

import java.util.List;

public class Schoool {
    private List<Students> students;
    private List<Teachers> teachers;
    private List<Applicants> applicants;
    private Principal principal;

    public Schoool (List<Students> students,List<Teachers> teachers, List<Applicants>applicants, Principal principal) {
        this.students = students;
        this.teachers = teachers;
        this.applicants = applicants;
        this.principal = principal;

    }
    public void admittedApplicants(Applicants applicant) {


    }

}
