//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class _10_RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            //4cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
                //if start<mid then there are more no's bigger than mid no bcoz otherwise if mid is pivot it would have been caught in earlier cases
            }
        }
        return  -1;
    }

}
