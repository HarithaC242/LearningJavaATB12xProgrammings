package Live_Assessment;

public class CQ4 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Original: " + number);  // 5

        // Pre-increment
        ++number;  // number becomes 6
        System.out.println("Pre-increment: " + number);  // 6

        // Post-increment
        int postInc = number++; // postInc = 6, number becomes 7
        System.out.println("Post-increment: " + postInc + " (returned " + postInc + ")");

        // Pre-decrement
        --number; // number becomes 6
        --number; // number becomes 5
        System.out.println("Pre-decrement: " + number); // 5

        // Post-decrement
        int postDec = number--; // postDec = 5, number becomes 4
        System.out.println("Post-decrement: " + postDec + " (returned " + postDec + ")");
    }
}
