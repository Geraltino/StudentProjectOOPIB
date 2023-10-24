package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String firstName;
        String Name3,Email3,Course3;
        Scanner scanner = new Scanner(System.in);
        Student user1 = new Student();


        System.out.print("Enter First Name: ");
        user1.setStudentName(scanner.nextLine());
        System.out.print("Enter Email Name: ");
        user1.setStudentEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user1.setCourseName(scanner.nextLine());

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();
        Student user2 = new Student(firstName);
        System.out.print("Enter Email: ");
        user2.setStudentAEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user2.setCourseAName(scanner.nextLine());

        System.out.print("Enter First Name: ");
        Name3 = scanner.nextLine();
        System.out.print("Enter Email: ");
        Email3 = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        Course3 = scanner.nextLine();
        Student user3 = new Student(Name3,Email3,Course3);

        user1.displayInfo();
        user2.displayInfoA();
        user3.displayInfoC();



    }
}