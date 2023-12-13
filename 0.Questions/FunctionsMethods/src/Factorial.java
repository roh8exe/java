import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        factorial(number);
    }
    static void factorial(int num){
        long fac =1;
        if (num<0) {
            System.out.println("Factorial of negative numbers is undefined.");
        } else if (num==0) {
            System.out.println("The factorial of 0 is 1.");
        }else {
            for (int i=2; i<=num ; i++) {
                fac *= i;
            }
            System.out.println("The factorial of "+num + " is: "+fac);
        }
    }
}
