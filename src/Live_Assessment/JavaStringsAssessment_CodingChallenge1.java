package Live_Assessment;
import java.util.Scanner;

public class JavaStringsAssessment_CodingChallenge1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for input
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // 1. Concatenation (for demo, appending "!" at the end)
            String concatenated = input + "!";

            // 2. Length
            int length = input.length();

            // 3. First character (if not empty)
            char firstChar = input.length() > 0 ? input.charAt(0) : ' ';

            // 4. Substring (from index 0 to 5 or up to available length)
            String substring = input.length() >= 6 ? input.substring(0, 6) : input;

            // Output results
            System.out.println("Original String: " + input);
            System.out.println("Concatenated String: " + concatenated);
            System.out.println("Length: " + length);
            System.out.println("First character: " + firstChar);
            System.out.println("Substring (0 to 5): " + substring);

            scanner.close();
        }
}