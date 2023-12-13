import java.util.Scanner;

public class SumFirstn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        findsum(number);
    }
    static void findsum(int num){
        int sum = 0;
        for (int x = 1; x <= num; x++)
            sum = sum + x;
        System.out.println("The sum of first "+num+" Numbers is "+sum);
    }
}
