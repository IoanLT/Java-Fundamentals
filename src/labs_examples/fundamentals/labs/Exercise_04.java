package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        byte x = 127;
        System.out.println("byte x is: " + x);

        short y = 20000;
        System.out.println("short y is: " + y);

        long z = 5000000000L;
        System.out.println("long z is: " + z);

        float a = 3.26f;
        System.out.println("float a is: " + a);

        double num = 5.435;
        System.out.println("double num is: " + num);

        boolean isTrue = true;
        System.out.println("boolean isTrue is: " + isTrue);

        char myChar = 'I';
        System.out.println("char myChar is: " + myChar);

    }

}