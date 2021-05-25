import java.util.ArrayList;
/**
 * This program adds number to an array using OOP.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-20
 */

public class MarlonStack {
    // Class for MarlonStack

    // properties
    /**
    * This is the Arraylist.
    */
    private ArrayList<Integer> stackAsList = new ArrayList<Integer>();

    // methods
    /**
    * This method pushes user input into the list.
    * @param userInput This is the user input.
    */
    public void push(final int userInput) {
        // adds user input to list
        stackAsList.add(userInput);
    }

    /**
    * This method clears the list.
    */
    public void clearMethod() throws Exception {
        // clears list
        if (this.stackAsList.size() > 0) {
            stackAsList.clear();
        } else {
            throw null;
        }
    }

    // getters
    /**
    * This method pops the first element of a list.
    * @return popElement This returns the first element.
    */
    public int pop() throws Exception {
        // pops the top element in a list

        // check if list is empty
        if (this.stackAsList.size() > 0) {
            int popElement = this.stackAsList.get(stackAsList.size() - 1);

            stackAsList.remove(stackAsList.size() - 1);

            return popElement;
        } else {
            throw null;
        }
    }

    /**
    * This method peeks the first element of a list.
    * @return peekElement This returns the first element.
    */
    public int peek() throws Exception {
        // peeks the top element

        // check if list is empty
        if (this.stackAsList.size() > 0) {
            // get top element
            int peekElement = this.stackAsList.get(stackAsList.size() - 1);

            return peekElement;
        } else {
            throw null;
        }
    }

    /**
    * This gets the rest of the list.
    * @return restOfList This returns the rest of the list.
    */
    public String showStack() {
        // variable
        String restOfList = "The rest of the list contains: ";

        // check if list is empty
        if (this.stackAsList.size() > 0) {
            // counter
            for (int counter = 0; counter < stackAsList.size(); counter++) {
                // gets each element
                restOfList = restOfList + stackAsList.get(counter) + ", ";
            }
        } else {
            // if list is empty, print "Null"
            restOfList = restOfList + "Null";
        }
        // return statement
        return restOfList;
    }
}
