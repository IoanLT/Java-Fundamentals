package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int num1 = input.nextInt();
        System.out.println("Please enter a number between 70 and 100");
        int num2 = input.nextInt();
        int sum = 0;
        double avg = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
            avg = sum / num2;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
