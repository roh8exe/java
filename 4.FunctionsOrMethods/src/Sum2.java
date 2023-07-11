import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    //return the value
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}

