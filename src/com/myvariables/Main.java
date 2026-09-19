/**
 * Java project to use variables as a method parameters.
 */

package com.myvariables;

/**
 *  Main class.
 */
public class Main {

        // Class primitive variable.
        int numberC = 11;

        // Class reference variable.
        String strC = "String of Class";

    // JVM entry point.
    public static void main(String[] args) {

        // Primitive variable.
        int number = 12;

        // Reference variable.
        String str = "String";

        System.out.println("Method adds 1: " + add(number)); // Output: Method adds 1: 13
        System.out.println("Method modifies string: " + modify(str)); // Output: Method modifies string: New String

        System.out.println("Original number: " + number); // Output: Original number: 12
        System.out.println("Original string: " + str); // Output: Original string: String;

        System.out.println("Method adds 1: " + add(new Main().numberC)); // Output: Method adds 1: 12
        System.out.println("Method modifies string: " + modify(new Main().strC)); // Output: Method modifies string: New String

        System.out.println("Original number: " + new Main().numberC); // Output: Original number: 11
        System.out.println("Original string: " + new Main().strC); // Output: Original string: String  of Class;

    }

    // Method to increase a number.
    public static int add(int number) {
        number++;
        return number;
    }

    // Method to modify a string.
    public static String modify(String str) {
        str = "New String";
        return str;
    }
}
