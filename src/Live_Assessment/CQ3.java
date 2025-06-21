package Live_Assessment;

public class CQ3 {

    public static void main(String[] args) {
        int i = 5;

        // Post-increment: value used first, then incremented
        System.out.println("Post-increment (i++):");
        System.out.println("Before: i = " + i);
        System.out.println("Result of i++: " + (i++));
        System.out.println("After: i = " + i);

        System.out.println(); // line break

        i = 5; // reset i for pre-increment demo

        // Pre-increment: value incremented first, then used
        System.out.println("Pre-increment (++i):");
        System.out.println("Before: i = " + i);
        System.out.println("Result of ++i: " + (++i));
        System.out.println("After: i = " + i);
    }

}
