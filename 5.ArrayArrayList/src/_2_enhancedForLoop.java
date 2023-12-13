import java.util.Scanner;

public class _2_enhancedForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int num : arr) { //for every element in array, print the element
            System.out.print(num + " ");
            //here num represents element of array
        }
        // System.out.println(arr[6]); //index out of bound ERROR

    }
}
