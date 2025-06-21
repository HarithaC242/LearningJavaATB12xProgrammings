package Live_Assessment;

import java.util.Scanner;

public class CQ7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers from user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Determine the largest using if-else if statements
        if (num1 >= num2 && num1 >= num3) {
            if (num1 == num2 && num1 == num3) {
                System.out.println("All numbers are equal.");
            } else {
                System.out.println("The largest number is: " + num1);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num2 == num3) {
                System.out.println("The largest numbers are equal: " + num2);
            } else {
                System.out.println("The largest number is: " + num2);
            }
        } else {
            if (num3 == num1) {
                System.out.println("The largest numbers are equal: " + num3);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }

        scanner.close();
    }

}
