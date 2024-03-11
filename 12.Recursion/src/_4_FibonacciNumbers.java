import java.util.Scanner;

public class _4_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(fibonacci(num));
    }
    static int fibonacci(int n) {
        //base condition
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
/*
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b ;
            b = b + a ;
            a = temp;
            count++ ;
        }
        System.out.println(b);

    }
 */