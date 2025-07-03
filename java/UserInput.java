package java;

import java.util.Scanner; // this is a Scanner class

public class UserInput {

    /*
     * In order for us to take user input, we use Scanner class.
     */
    public static void main(String[] args) {
        // creating a Scanner object
        /*
         * Syntax of creating an object:
         * NameOfTheClass nameOfIdentifier = new NameOfTheClass();
         *
         * Syntax of Scanner
         * Scanner nameOfIdentifier = new Scanner(Where are you collecting the input
         * from.);
         */

        // Scanner input = new Scanner(System.in)
        // Scanner in = new Scanner(System,in)
        // Scanner scanner = new Scanner(System.in)
        Scanner userInput = new Scanner(System.in);

        // nextInt() => for integers
        // nextDouble() => for decimals
        // nextBoolean() => for booleans
        // next() => Single String
        // nextLine() => for the whole line

        // Note: everytime the nextLine() comes after what is above it, you must clear
        // the buffer

        System.out.println("Enter your age:");
        int age = userInput.nextInt();
        System.out.println(age);

        System.out.println("Enter your pi value:");
        double PI = userInput.nextDouble();
        System.out.println(PI);

        System.out.println("Enter your line:");
        String myLine = userInput.next(); // it takes values that comes before space.
        System.out.println(myLine);

        // clear the buffer
        userInput.nextLine();

        System.out.println("Enter sequence of characters:");
        String sequence = userInput.nextLine();
        System.out.println(sequence);

        userInput.close();
    }

    // syntax of methods
    // access-modifier non-access-modifier return type nameOfTheMethod(parameters) {
    // code-block
    // }
}