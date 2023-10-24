package ie.atu;

public class Main {

    public static void main(String[] args){
        // 3 Objects as Student Information
        Student user1 = new Student();
        StudentC user2 = new StudentC();

        user1.setStudentName("d");
        user1.setStudentEmail("dsw");
        user1.setCourseName("UwU");
        user2.getUserInputC();



        user1.displayInfo();
        user2.displayInfoC();

    }
}