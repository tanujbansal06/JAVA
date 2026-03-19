public class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("Name: " + name + " | Marks: " + marks);
    }
}