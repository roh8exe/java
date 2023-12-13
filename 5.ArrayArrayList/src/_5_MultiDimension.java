import java.util.Arrays;

public class _5_MultiDimension {
    public static void main(String[] args) {
        //   int[][] arr = new int[3][]; //note:- adding no of rows is mandatory , adding no of columns is not mandatory
        int[][] arr = {
                {1, 2, 3}, //0th index
                {4, 5, 6, 7}, //1st index
                {7, 8, 9, 10, 11} //2nd index
        };
        //   System.out.println(Arrays.deepToString(arr));
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
