import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        gradeManager manager = new gradeManager();

        while(true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Show Topper");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    manager.addStudent(name, marks);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    manager.findTopper();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}