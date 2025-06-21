package Live_Assessment;

import java.util.Scanner;

public class CQ6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Classify the number using if-else statements
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }

}
