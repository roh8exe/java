import java.util.Arrays;

public class _1_BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,4,1};
        bubble((arr));
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped = false; //if the array is already swapped
            //for each step , max item will come at last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if item is smaller than prev item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if u did not swap for particular value of i , it means the array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
}
