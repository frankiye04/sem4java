//EX6
import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private double marks;
    public Student(String name, int rollNumber, String grade, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        Student student = new Student(name, rollNumber, grade, marks);
        student.displayDetails();
    }
}
