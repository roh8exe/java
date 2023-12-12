import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = in.nextInt();
        System.out.print("Enter the first number (b): ");
        int b = in.nextInt();
        System.out.print("Enter the first number (c): ");
        int c = in.nextInt();
        if (pythagoreantriplet(a,b,c)){
            System.out.println("The given triplet is a Pythagorean triplet.");
        }else{
            System.out.println("The given triplet is not a Pythagorean triplet.");
        }

    }
    static boolean pythagoreantriplet(int a,int b,int c){
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        return (a * a + b * b == c * c);

    }
}
