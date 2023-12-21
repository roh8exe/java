import java.util.Arrays;
import java.util.Scanner;

public class _5_SearchIn2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //for each col in every row
                arr[row][col] = in.nextInt();
            }
        }
                System.out.print("the number to be searched is: ");
                int target = in.nextInt();

                int[] ans = search(arr, target);
                if (ans.length == 0) {
                    System.out.println("Number not found");
                }else {
                    System.out.println("Number found at position: " + Arrays.toString(ans));
                }

            }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{};
    }
}





    
