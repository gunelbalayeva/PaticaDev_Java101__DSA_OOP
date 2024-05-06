package com.example._6_Class.practic1;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Teacher not added");
        }

    }

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;;
    }

    void printTeacher() {
        teacher.print();
    }

}
