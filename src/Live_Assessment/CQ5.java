package Live_Assessment;

public class CQ5 {

    public static void main(String[] args) {
        int a = 10, b = 5;
        int x = 8, y = 3;

        // 1. Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational / Comparison Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        System.out.println("(a > b) && (x < y): " + ((a > b) && (x < y)));
        System.out.println("(a > b) || (x < y): " + ((a > b) || (x < y)));
        System.out.println("!(a > b): " + !(a > b));

        // 4. Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("c += 5: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);

        // 5. Ternary Operators
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }

}
