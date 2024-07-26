import java.util.Scanner;

public class _6_Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the base:- ");
        int base = in.nextInt();
        System.out.print("Please Enter the power:- ");
        int power = in.nextInt();
        int ans = 1;
        while (power > 0) {
            if ((power & 1)==1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
