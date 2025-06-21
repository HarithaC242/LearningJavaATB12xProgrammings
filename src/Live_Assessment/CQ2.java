package Live_Assessment;

public class CQ2 {

    public static void main(String[] args) {

        // Arithmetic operations
        int num1 = 10;
        int num2 = 5;

        int addition = num1 + num2;          // 10 + 5 = 15
        int subtraction = num1 - num2;       // 10 - 5 = 5
        int multiplication = num1 * num2;    // 10 * 5 = 50
        int division = num1 / num2;          // 10 / 5 = 2
        int modulus = num1 % num2;           // 10 % 5 = 0

        // Print arithmetic results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Assignment operations
        int value = 20;
        value += 5;   // value = value + 5 → 25
        System.out.println("After += : " + value);

        value -= 10;  // value = value - 10 → 15
        System.out.println("After -= : " + value);

        value *= 2;   // value = value * 2 → 30
        System.out.println("After *= : " + value);

        value /= 3;   // value = value / 3 → 10
        System.out.println("After /= : " + value);
    }
}