package org.example.classwork2;


import java.util.List;

public class Teachers extends Person {
    private List<Courses> courses;
    public Teachers(String name, int age, String id) {
        super(name, age, id);
    }
    public void teach(Courses course) {
        courses.add(course);

    }
    public void teaching(Courses course) {
        System.out.println(name +" " + "is teaching a course"+" "+ course.getTitle()+ " "+course.getCode());
    }

}
