//EX4
import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            sum += marks;
        }
        double average = (double) sum / numberOfSubjects;
        System.out.println("\nTotal Marks: " + sum);
        System.out.println("Average Marks: " + average);
    }
}
