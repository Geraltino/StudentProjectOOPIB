package ie.atu;

import java.util.Scanner;
public class Student {
    private String studentName;
    private String studentEmail;
    private String courseName;


    //Setters
    public void setStudentName(String studentName){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.studentName = scanner.nextLine();}
    public void setStudentEmail(String studentEmail){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Email: ");
        this.studentEmail = scanner.nextLine();
    }
    public void setCourseName(String courseName){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        this.courseName = scanner.nextLine();
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