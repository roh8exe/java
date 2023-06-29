import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //widening
        float num = input.nextFloat();
        System.out.println(num);
        //narrowing
        int numb = (int)(67.89f);
        System.out.println(numb);
        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 =1
        System.out.println(b);
    }
}
