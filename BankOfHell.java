import java.util.Scanner;

public class BankOfHell {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Bank of Hell");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        // Task 1 - Pick up the user's decision.
        String decision = scanner.next();

        // Task 2 - Print this if the decision is "yes"
        if (decision.equals("yes")) {
            System.out.println("""

                    Great!
                    How much money do you have in your savings?
                    And, how much do you owe in credit card debt""");

            // Task 3 - Pick up each value

            // scanner.nextLine();
            double savings = scanner.nextDouble();
            // scanner.nextLine();
            double debt = scanner.nextDouble();

            // Task 4 - Pick up number of years
            scanner.nextLine();
            System.out.println("\nHow many years have you worked for?");
            int years = scanner.nextInt();

            // Task 5 - Pick up name
            scanner.nextLine();
            System.out.println("What is your name?");
            String name = scanner.next();

            // Task 6 - Approve the mortgage if they meet the requirements (see article)
            if (savings >= 10_000 && debt < 5_000 && years >= 2) {
                System.out.println("Congratulations " + name + ", you have been approved!");
            } else {
                // - Otherwise, don't give them a mortgage.
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }

        } else if (decision.equals("no")) {
            // Task 2 - Print this if the decision was not "yes"
            System.out.println("\nOK. Have a nice day!");
        }

        scanner.close();
    }
}
