/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Quotes;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world. Welcome to the Quote Grabber";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to a random quote? (1 Yes, 2 No)");
        int decision = scanner.nextInt();
        System.out.println("What is your local file path to assets?");
        String filePath = scanner.next();
        if (decision == 1) {
            System.out.println(GSONQuoteGrabber.quoteGetter(filePath));
        } else {
            System.out.println("Oh ok that was allowed I guess.");
        }
    }
}
