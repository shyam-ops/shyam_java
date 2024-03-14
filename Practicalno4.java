
/*Practical No 4
  Author: Shyam Patil
  Roll No: AD22029 */
import java.util.Scanner;

public class Practicalno4 {
    public static void printName(String name) {
        name = name.trim();
        String[] names = name.split("\\s+");
        String firstName = names[0];
        String lastName = names[1];
        String formattedName = lastName + ", " + firstName;
        System.out.println("Formatted name: " + formattedName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name (format: <first name> <last name>): ");
        String name = scanner.nextLine();
        printName(name);
        scanner.close();
    }
}
