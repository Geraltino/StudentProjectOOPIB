package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // 3 Objects as Student Information
        Scanner scanner = new Scanner(System.in);
        Student user1 = new Student();


        System.out.print("Enter First Name: ");
        user1.setStudentName(scanner.nextLine());
        System.out.print("Enter Email Name: ");
        user1.setStudentEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user1.setCourseName(scanner.nextLine());


        user1.displayInfo();



    }
}