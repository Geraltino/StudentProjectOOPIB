package ie.atu;

public class Main {

    public static void main(String[] args){
        Student user1 = new Student();
        Student user2 = new Student();
        Student user3 = new Student();

        user1.getUserInput();
        user2.getUserInput();
        user3.getUserInput();


        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();
    }
}