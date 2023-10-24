package ie.atu;

import java.util.Scanner;

public class StudentC {
    private String studentCname;
    private String studentCEmail;
    private String courseCName;
    public StudentC(){
        this.studentCname = "DefaultName";
        this.studentCEmail = "DefaultEmail@atu.ie";
        this.courseCName = "DefaultCourse";
    }
    //Constructor
    public StudentC(String studentName, String studentEmail, String courseName){
        this.studentCname = studentName;
        this.studentCEmail = studentEmail;
        this.courseCName = courseName;
    }
    public void getUserInputC(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        this.studentCname = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        this.studentCEmail = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        this.courseCName = scanner.nextLine();
    }


    public void displayInfoC() {
        System.out.println("Student Name: " + studentCname + " Student Email:" + studentCEmail + " Course Name: " + courseCName);
    }
}
