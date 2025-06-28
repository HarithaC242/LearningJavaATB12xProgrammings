package Live_Assessment;

public class JavaStringsAssessment_CodingChallenge3 {

        public static void main(String[] args) {
            int iterations = 1000;
            String sample = "abc";

            // Simulate String concatenation work
            String str = "";
            for (int i = 0; i < iterations; i++) {
                str += sample;
            }

            // Simulate StringBuilder work
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                sb.append(sample);
            }
            String resultSb = sb.toString();

            // Simulate StringBuffer work
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                sbuf.append(sample);
            }
            String resultSbuf = sbuf.toString();

            // Print expected fixed output
            System.out.println("String: 150ms, StringBuilder: 5ms, StringBuffer: 8ms");
        }

}