package day09_08_31_2022.student;

import java.time.LocalDate;

public class Student {

    String name;
    long id;
    int age;
    char gender;
    LocalDate dateOfBirth;
    static String schoolName;

    //  this is only method for assigning values for objects
    public void setInfo(String name, long id, int age, char gender, LocalDate dateOfBirth, String schoolName){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.schoolName = schoolName;
    }

    public String toString(){
        return "Name: " + name + ", id: " + id + ", age: " + age + ", gender: " + gender + ", date of birth: " + dateOfBirth + ", school name: " + schoolName;
    }
}
