import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

       funmax(num1, num2, num3);
       funmin(num1, num2, num3);
    }
    static void funmax(int a,int b,int c){
        int max=0;
        if (a>b){
            max=a;
        }else {
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("The Largest Number is: "+max);
    }
    static void funmin(int a,int b,int c){
        int min=0;
        if (a<b){
            min=a;
        }else {
            min=b;
        }
        if (c<min){
            min=c;
        }
        System.out.println("The Smallest Number is: "+min);
    }
}
