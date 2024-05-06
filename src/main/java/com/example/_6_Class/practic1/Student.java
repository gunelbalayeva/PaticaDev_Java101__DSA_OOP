package com.example._6_Class.practic1;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String clases;
    double awg;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String studentNo, String clases,
                   double awg, boolean isPass) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.studentNo = studentNo;
        this.clases = clases;
        this.awg = 0.0;
        this.isPass = false;
    }

    void addBulkkExamNote(int not1, int not2, int not3){
        if (not1>=0 && not1 <=100) {
            c1.note = not1;
        }
        if (not2>=0 && not2 <=100) {
            c2.note = not2;
        }
        if (not3>=0 && not3 <=100) {
            c3.note = not3;
        }
    }
    void  isPass(){
        this.awg = (this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.awg > 55) {
            this.isPass = true;
            System.out.println("Hababam sinifi uyaniyor.");
        }else {
            this.isPass = false;
            System.out.println("Habababam sinifi sinifda kaldi");
        }

        printNote();
    }
    void printNote(){
        System.out.println(c1.name+"Note: "+c1.note);
        System.out.println(c2.name+"Note: "+c2.note);
        System.out.println(c3.name+"Note: "+c3.note);
    }
}
