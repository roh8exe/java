import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please eneter the number: ");
        int number = in.nextInt();
        palindrome(number);
    }
    static void palindrome(int num){
        int orginial = num;
        System.out.println("The given number is: "+orginial);
        int reverse = 0;

        while (num>0) {
            int rem = num%10;
            num /= 10;
            reverse = reverse*10 + rem;

        }
        if (reverse==orginial) {
            System.out.println(reverse + " is a Palindrome.");
        }else {
            System.out.println(reverse + " is not a Palindrome.");
        }
    }
}
