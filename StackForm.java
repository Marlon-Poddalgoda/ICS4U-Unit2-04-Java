import java.util.Scanner;
/**
 * This program adds number to an array using OOP.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-20
 */

public final class StackForm {
    private StackForm() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method takes in user input.
    * @param args
    */
    public static void main(final String[] args) {
        // main stub, get user input here

        // constant
        final int three = 3;

        try {

            // Create new Scanner-type variable
            Scanner paramInput = new Scanner(System.in);

            // new instance
            MarlonStack myStack = new MarlonStack();

            // loop for user input
            for (int counter = 0; counter < three; counter++) {
                // asks user to input 3 numbers
                System.out.print("Please enter a number to add to the list: ");
                // check if input is an integer
                while (!paramInput.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.print("Enter an int to add to the list: ");
                    paramInput.next(); // moves scanner until correct value
                }
                int userInput = paramInput.nextInt();

                // call method
                myStack.push(userInput);
            }
            System.out.println();

            // pop method
            System.out.println("The top element to be popped is -> "
                                + myStack.pop());

            // call method
            System.out.println(myStack.showStack());

            // peek method
            System.out.println("The top element currently is -> "
                                + myStack.peek());

            // clear method
            myStack.clearMethod();
            System.out.println("The list has been cleared.");

            // call method
            System.out.println(myStack.showStack());
            System.out.println();

            // program closes
            System.out.println();
            System.out.println("Done.");

        } catch (Exception e) {
            System.out.println();
            System.out.println("Sorry, invalid input.");
        }
    }
}
