import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        oddeven(num);
    }
    static void oddeven(int number){
        if (number%2==0){
            System.out.println(number +" is an even number");
        }else {
            System.out.println(number +" is an odd number");
        }
    }
}
