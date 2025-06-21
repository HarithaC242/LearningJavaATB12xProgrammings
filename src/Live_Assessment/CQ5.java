package Live_Assessment;

public class CQ5 {

    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        // Complex expression showing operator precedence
        // (a * 2) + (int)b => (10 * 2) + 3 = 20 + 3 = 23
        int expressionResult = a * 2 + (int)b;
        System.out.println("Expression result: " + expressionResult);

        // Implicit casting: int + double = double
        double implicitCasting = a + b;  // 10 + 3.5 = 13.5
        System.out.println("Implicit casting: " + implicitCasting);

        // Explicit casting: force the result to be int
        int explicitCasting = (int)(a + b);  // (int)13.5 = 13
        System.out.println("Explicit casting: " + explicitCasting);
    }
}
