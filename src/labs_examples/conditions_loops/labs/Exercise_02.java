package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */
import java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");
        int num = input.nextInt();

        if(num == 1) System.out.println("Monday");
        else if(num == 2) System.out.println("Tuesday");
        else if (num == 3) System.out.println("Wednesday");
        else if (num == 4) System.out.println("Thursday");
        else if (num == 5) System.out.println("Friday");
        else if (num == 6) System.out.println("Saturday");
        else if (num == 7) System.out.println("Sunday");
        else System.out.println("The number needs to be between 1 and 7");
    }
}
