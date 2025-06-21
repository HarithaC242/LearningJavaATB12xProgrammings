package Live_Assessment;

public class CQ4 {

    public static void main(String[] args) {

        // Implicit Casting (Widening)
        int intVal = 100;
        long longVal = intVal;          // int to long
        float floatVal = longVal;       // long to float

        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("int value: " + intVal);
        System.out.println("long value (from int): " + longVal);
        System.out.println("float value (from long): " + floatVal);

        System.out.println(); // Line break

        // Explicit Casting (Narrowing)
        double doubleVal = 99.99;
        int intFromDouble = (int) doubleVal;    // double to int (fraction lost)
        byte byteFromInt = (byte) intFromDouble; // int to byte

        System.out.println("Explicit Type Casting (Narrowing):");
        System.out.println("double value: " + doubleVal);
        System.out.println("int value (from double): " + intFromDouble);
        System.out.println("byte value (from int): " + byteFromInt);
    }

}
