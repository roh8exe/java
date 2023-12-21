import java.util.Arrays;
import java.util.Scanner;

public class _6_MaxIn2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //for each col in every row
                arr[row][col] = in.nextInt();
            }
        }
        System.out.print("The maximum number in given array is: ");
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints)
                if (element > max) {
                    max = element;
                }
        }
        return max;
    }
}
