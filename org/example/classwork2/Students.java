package org.example.classwork2;

import java.util.List;

public class Students extends Person {
    private String courses;

    public Students(String name, int age, String id, String courses) {
        super(name, age, id);
        this.courses = courses;
    }

    public void takeCourses(Courses course) {
        System.out.println(name + " " + "is taking"+" "+ course.getCode()+ " "+ course.getTitle());

    }
}
