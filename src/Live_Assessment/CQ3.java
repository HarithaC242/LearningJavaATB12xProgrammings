package Live_Assessment;

public class CQ3 {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Comparison operators
        System.out.println("a == b: " + (a == b));       // false
        System.out.println("a > b: " + (a > b));         // true
        System.out.println("a < b: " + (a < b));         // false

        // Logical operators
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));  // true
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));  // true
        System.out.println("!(a > b): " + !(a > b));                        // false
    }
}
