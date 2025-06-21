package Live_Assessment;

public class CQ1 {

        // Primitive data types as instance variables
        byte byteVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;
        char charVar;
        boolean booleanVar;

        public static void main(String[] args) {
           CQ1 obj = new CQ1();

            System.out.println("Default values of primitive data types:");
            System.out.println("byte: " + obj.byteVar);
            System.out.println("short: " + obj.shortVar);
            System.out.println("int: " + obj.intVar);
            System.out.println("long: " + obj.longVar);
            System.out.println("float: " + obj.floatVar);
            System.out.println("double: " + obj.doubleVar);
            System.out.println("char: '" + obj.charVar + "'"); // char will print as blank
            System.out.println("boolean: " + obj.booleanVar);
        }

}
