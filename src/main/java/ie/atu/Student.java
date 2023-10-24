package ie.atu;

import java.util.Scanner;
public class Student {
    private String studentName;
    private String studentEmail;
    private String courseName;
    private String studentAName;
    private String studentAEmail;
    private String courseAName;
    private String studentCName;
    private String studentCEmail;
    private String courseCName;



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

    public Student(String studentAName){
        this.studentAName = studentAName;
    }
    public void setStudentAEmail(String studentAEmail){
        this.studentAEmail = studentAEmail;
    }
    public void setCourseAName(String courseAName){
        this.courseAName = courseAName;
    }
    public String getStudentAEmail(){
        return studentAEmail;
    }
    public String getCourseAName(){
        return courseAName;
    }

    //Constructor
    public Student(String studentCName, String studentCEmail, String courseCName){
        this.studentCName = studentCName;
        this.studentCEmail = studentCEmail;
        this.courseCName = courseCName;
    }


    public void displayInfo() {
        System.out.println("\nStudent Name: " + getStudentName() + "\nStudent Email: " + getStudentEmail() + "\nCourse Name: " + getCourseName());
    }
    public void displayInfoA() {
        System.out.println("\nStudent Name: " + studentAName + "\nStudent Email: " + getStudentAEmail() + "\nCourse Name: " + getCourseAName());
    }
    public void displayInfoC() {
        System.out.println("\nStudent Name: " + studentCName + "\nStudent Email: " + studentCEmail + "\nCourse Name: " + courseCName);
    }}
