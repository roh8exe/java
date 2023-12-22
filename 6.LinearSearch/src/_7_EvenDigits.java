import java.util.Scanner;

public class _7_EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums ) {
        int count = 0;
        for (int num : nums)
            if (even(num)) {
                count++;
            }
        return count;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2  == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;

    }

    //count number of digits in a number
    static int digits(int num) {
        if ( num <0 ) {
            num = num * -1;
        }
        if ( num == 0 ) {
            return 1;
        }
        int count = 0;
        while ( num > 0) {
            count++;
            num /=10;
        }
        return count;
    }
}
