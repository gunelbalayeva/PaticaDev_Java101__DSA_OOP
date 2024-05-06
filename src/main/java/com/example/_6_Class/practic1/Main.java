package com.example._6_Class.practic1;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "12345", "FZK");
        Teacher t2 = new Teacher("Grahan Bell", "563245", "KMY");
        Teacher t3 = new Teacher("Ahmet Hoca", "12345", "RYZ");

        Course fizika = new Course("Fizika", "102", "FZK");
        fizika.addTeacher(t1);
        Course kimiya = new Course("Kimiya", "103", "KMY");
        fizika.addTeacher(t2);
        Course riyaziyyat = new Course("Riyaziyyat", "104", "RYZ");
        fizika.addTeacher(t3);

        Student s1 = new Student(fizika, kimiya, riyaziyyat, "AAAA", "1244", "8", 91.1, true);
        s1.addBulkkExamNote(100, 78, 50);
        s1.isPass();

    }
}
