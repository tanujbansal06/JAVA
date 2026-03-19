import java.util.*;

public class gradeManager {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
    }

    void displayStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    void findTopper() {
        Student topper = students.get(0);

        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }

        System.out.println("Topper: " + topper.name + " with marks " + topper.marks);
    }
}