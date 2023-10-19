package ie.atu;

import java.util.Scanner;
public class Student {
    private String studentName;
    private String studentEmail;
    private String courseName;

    // Default Constructor
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

    // Method to get user input
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        this.studentEmail = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        this.courseName = scanner.nextLine();


    }

    //setters
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
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

    public void displayInfo() {
        System.out.println("Student Name: " + getStudentName() + " Student Email:" + getStudentEmail() + " Course Name: " + getCourseName());
    }
}