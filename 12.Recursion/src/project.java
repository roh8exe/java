import java.util.ArrayList;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] transactions = new double[100]; // Assuming a maximum of 100 transactions
        int transactionCount = 0;

        while (true) {
            System.out.println("Personal Budget Tracker");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount: $");
                    double income = scanner.nextDouble();
                    transactions[transactionCount++] = income;
                    System.out.println("Income added successfully!\n");
                    break;

                case 2:
                    System.out.print("Enter expense amount: $");
                    double expense = scanner.nextDouble();
                    transactions[transactionCount++] = -expense; // Expenses are represented as negative values
                    System.out.println("Expense added successfully!\n");
                    break;

                case 3:
                    displaySummary(transactions, transactionCount);
                    break;

                case 4:
                    System.out.println("Exiting Personal Budget Tracker. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    private static void displaySummary(double[] transactions, int transactionCount) {
        double totalIncome = 0;
        double totalExpense = 0;

        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i] > 0) {
                totalIncome += transactions[i];
            } else {
                totalExpense -= transactions[i]; // Expenses are stored as negative values
            }
        }

        double netBalance = totalIncome - totalExpense;

        System.out.println("\nSummary:");
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpense);
        System.out.println("Net Balance: $" + netBalance + "\n");
    }
}
