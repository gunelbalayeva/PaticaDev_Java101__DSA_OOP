package com.example._6_Class.practic1;

public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name, String mpNo, String branch) {
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + name + "Telephone: " + mpNo + "Branch: " + branch);
    }
}
