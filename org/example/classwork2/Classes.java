package org.example.classwork2;


import java.util.ArrayList;
import java.util.List;

public class Classes {
    private String name;
    private Teachers teacher;
    private List<Students> students = new ArrayList<>();

    public Classes(String name, Teachers teacher, List<Students> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {

        this.teacher = teacher;
    }

    public List<Students> getStudents() {

        return students;
    }

    public void setStudents(List<Students> students) {

        this.students = students;
    }
}
