package ex_01_Java_Basics;

public class Lab009_Println_vs_print {

    public static void main(String[] args) {

        // by using println, output will be each sentence will be written in new line
        System.out.println("Hi");
        System.out.println("Bye");
        // here the output will be in first line Hi then next line Bye

        // by using print, output is all will be written in same line
        System.out.print("Hi");
        System.out.print("Bye");
        // here the output will be HiBye

    }
}
