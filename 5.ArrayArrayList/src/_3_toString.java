import java.util.Arrays;
import java.util.Scanner;

public class _3_toString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        String[] str = new String[5];
        for(int j = 0; j<str.length; j++) {
            str[j] = in.next();
        }
        str[1]="rohit";
        System.out.println(Arrays.toString(str));
    }
}
