package ex_01_Java_Basics;

public class Multiple_Main_Method {

    public static void main(String[] args) {
//jm will recognize only this as main method
        //String[] - is called as String array
    }

    public static void main(int args) {
// jvm will not recognize this method
    }

    public static void main(String args) {
// jvm will not recognize this method
    }
    //Note or Interview question:
    // There can be multiple main methods, but only one main method with JVM Recognize.
    // You can have multiple main functions, but only one function of main which is recognized by JVM should be present.
    // The concept of multiple main function in the program is called as main method overloading.
    // in java, Functions is same as method; There is no difference between main method & main function
    // Function == methods

}
