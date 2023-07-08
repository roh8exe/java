import java.util.Scanner;

public class Largestex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number: ");
                int a = in.nextInt();
        System.out.print("enter second number: ");
                int b = in.nextInt();
        System.out.print("enter third number: ");
                int c =  in.nextInt();

                int max = a;
                if(b>max){
                    max = b;
                }
                if(c>max){
                    max=c;
                }
        System.out.print("the largest number is: ");
        System.out.println(max);
    }
}
