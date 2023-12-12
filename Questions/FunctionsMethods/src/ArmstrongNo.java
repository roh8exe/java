import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
     //   int n = in.nextInt();
     //   System.out.println(isArmtrong(n));

        for (int i=100; i<1000; i++) {
            if (isArmtrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmtrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }
}
