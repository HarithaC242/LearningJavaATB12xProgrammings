package Live_Assessment;

public class CQ2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str = "Result: ";

        // Numeric addition first, then string concatenation
        System.out.println("a + b = " + (a + b)); // 30

        // Left to right evaluation with a string first
        System.out.println(str + a + b); // "Result: 1020"

        // Add numbers first using parentheses
        System.out.println(str + (a + b)); // "Result: 30"

        // Mixing strings and numbers in different positions
        System.out.println(a + b + str); // "30Result: "

        // Combining numbers and strings explicitly
        String result = a + " + " + b + " = " + (a + b);
        System.out.println(result); // "10 + 20 = 30"
    }
}