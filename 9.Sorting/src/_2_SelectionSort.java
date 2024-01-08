import java.util.Arrays;

public class _2_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 1};
        selection((arr));
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in remaining array and swap with correct index
            int last = arr.length - i - 1;
            int MaxIndex = getMaxindex(arr, 0, last);
            swap(arr,MaxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    private static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
