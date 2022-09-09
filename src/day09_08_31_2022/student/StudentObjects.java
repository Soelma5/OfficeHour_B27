package day09_08_31_2022.student;

import java.time.LocalDate;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Bulat", 23, 32, 'M', LocalDate.of(1990, 10, 8), "CYDEO");
        System.out.println("Student 1: " + student1);

        Student student2 = new Student();
        student2.setInfo("Eva", 12, 3, 'F', LocalDate.of(2019, 07, 17), "CYDEO");
        System.out.println("Student 2: " + student2);

        student1.schoolName = "CYDEO1";
        System.out.println(student1);
        System.out.println(student2);
    }
}
