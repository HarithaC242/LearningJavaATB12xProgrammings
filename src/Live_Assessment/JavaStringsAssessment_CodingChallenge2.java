package Live_Assessment;


public class JavaStringsAssessment_CodingChallenge2 {

        public static void main(String[] args) {
            String string1 = "Hello";
            String string2 = "hello";
            String string3 = "Hello";

            // equals() between string1 and string2
            boolean equalsResult = string1.equals(string2);

            // equalsIgnoreCase() between string1 and string2
            boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);

            // compareTo() between string1 and string2
            int compareToResult = string1.compareTo(string2);

            // Output the results
            System.out.println("equals(): " + equalsResult + ", equalsIgnoreCase(): " + equalsIgnoreCaseResult + ", compareTo(): " + compareToResult);
        }

}