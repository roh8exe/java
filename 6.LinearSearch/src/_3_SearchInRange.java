import java.util.Arrays;
import java.util.Scanner;

public class _3_SearchInRange {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] arr = new int[6];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.print("The given numbers are: ");
            System.out.println(Arrays.toString(arr));
            System.out.print("Enter the number to be searched: ");
            int target = in.nextInt();
            String ans = linearsearch(arr , target , 2,5 );
            System.out.println(ans);


        }
        //search in array : return the index if item found
        //otherwise if item not found return -1

        static String linearsearch(int[] arr , int target, int start, int end) {
            if (arr.length == 0) {
                return "Please enter the numbers";
            }
            //run a for loop
            for (int index = start; index<=end; index++) {
                //check for element at every index if it is = target
                int element = arr[index];
                if (element == target) {
                    return "The Number " +element +" is found at index: " + index;
                }
            }
            //this line will execute if none of return statement above have executed
            //hence the target not found
            return "No such number is found!";
        }
    }

