//EX5
import java.util.Scanner;
public class BubbleSortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter 10 student names:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("\nStudent names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
