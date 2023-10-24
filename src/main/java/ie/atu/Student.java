package ie.atu;

import java.util.Scanner;
public class Student {
    private String studentName;
    private String studentEmail;
    private String courseName;


    //Setters
    public void setStudentName(String studentName){this.studentName = studentName;}
    public void setStudentEmail(String studentEmail){
        this.studentEmail = studentEmail;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }



    //Getters
    public String getStudentName(){
        return studentName;
    }
    public String getStudentEmail(){
        return studentEmail;
    }
    public String getCourseName(){
        return courseName;
    }

    public Student(){
        this.studentName = "DefaultName";
        this.studentEmail = "DefaultEmail@atu.ie";
        this.courseName = "DefaultCourse";
    }

    public Student(String studentName){
        this.studentName = studentName;
    }
    //Constructor
    public Student(String studentName, String studentEmail, String courseName){
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.courseName = courseName;
    }


    public void displayInfo() {
        System.out.println("\nStudent Name: " + getStudentName() + "\nStudent Email: " + getStudentEmail() + "\nCourse Name: " + getCourseName());
    }
}