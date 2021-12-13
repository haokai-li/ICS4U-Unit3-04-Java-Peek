/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "lock" program.
*/
final class Main {
    /**
    * The three.
    */
    private static final int THREE = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final HaokaiStack aStack = new HaokaiStack();
        final Scanner userInput = new Scanner(System.in);

        System.out.print("First Push: ");
        aStack.showStack();

        String pushInput = null;

        System.out.print("Second Push: ");
        pushInput = userInput.nextLine();
        aStack.push(pushInput);
        aStack.showStack();
        System.out.println("(1)Top value is " + aStack.peekWork() + "\n");

        System.out.print("Third Push: ");
        pushInput = userInput.nextLine();
        aStack.push(pushInput);
        aStack.showStack();
        System.out.println("(2)Top value is " + aStack.peekWork() + "\n ");

        System.out.print("Fourth Push: ");
        pushInput = userInput.nextLine();
        aStack.push(pushInput);
        aStack.showStack();
        System.out.println("(3)Top value is " + aStack.peekWork() + "\n  ");

        System.out.println("Clearing ......");
        aStack.clearWork();
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
