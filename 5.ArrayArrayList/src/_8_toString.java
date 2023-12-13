import java.util.Arrays;
import java.util.Scanner;

public class _8_toString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no of rows

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //for each col in every row
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
