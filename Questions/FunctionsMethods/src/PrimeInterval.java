import java.util.Scanner;

public class PrimeInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting number of the interval: ");
        int start = in.nextInt();
        System.out.print("Enter the ending number of the interval: ");
        int end = in.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimeNumbers(start, end);
    }
    static void printPrimeNumbers(int start,int end) {
        boolean prime = false;
        for (int num = start + 1; num < end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                prime = true;
            }
        }
        if (prime) {
            System.out.println();
        } else {
            System.out.println("No prime numbers in the interval.");
        }
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
