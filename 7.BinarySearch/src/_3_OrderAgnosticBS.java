public class _3_OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {25,21,18,27,23,21,19,16,14,13,11,10,7,5,4,2,1,0,-1,-3,-5,-7,-9};
        int target = 10;
        String ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static String OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return "the number " + target + " is present at " + mid + "th position";
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return "No such number is present";
    }
}
