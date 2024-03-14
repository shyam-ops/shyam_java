// Aim:Practical No 3
// Author:Peeyush Kaware
// Roll_No:AD22057
// Date:13/2/2024
import java.util.Scanner;
public class PracticalNo3 {
    public static double calculateVolume(Double side) {
        return Math.pow(side, 3);
    }
    public static double calculateVolume(Double radius, Double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public static double calculateVolume(Double length, Double width, Double height) {
        return length * width * height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        Double cubeSide = scanner.nextDouble();
        System.out.print("Enter the radius of the cylinder: ");
        Double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        Double cylinderHeight = scanner.nextDouble();
        System.out.print("Enter the length of the box: ");
        Double boxLength = scanner.nextDouble();
        System.out.print("Enter the width of the box: ");
        Double boxWidth = scanner.nextDouble();
        System.out.print("Enter the height of the box: ");
        Double boxHeight = scanner.nextDouble();
        double cubeVolume = calculateVolume(cubeSide);
        double cylinderVolume = calculateVolume(cylinderRadius, cylinderHeight);
        double boxVolume = calculateVolume(boxLength, boxWidth, boxHeight);
        System.out.println("Volume of cube: " + cubeVolume);
        System.out.println("Volume of cylinder: " + cylinderVolume);
        System.out.println("Volume of box: " + boxVolume);
        scanner.close();
    }
}
