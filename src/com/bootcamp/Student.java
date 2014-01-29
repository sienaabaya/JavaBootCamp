package com.bootcamp;

/**
 * Created by angelicasiena on 1/29/14.
 */
public class Student extends Person{
    int idNumber;
    String course;

    public Student(){

    }

    public Student(String firstName, String lastName, int idNumber, String course) {
        super(firstName, lastName);
        this.idNumber = idNumber;
        this.course = course;
    }

    public Student(int idNumber, String course) {
        this.idNumber = idNumber;
        this.course = course;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentInfo(){
        return this.idNumber+ " " + this.course;
    }

    public String toString(String i){
        return this.idNumber+i;
    }
}
