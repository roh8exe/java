public class _2_DescendingOrderArray {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {25,21,18,27,23,21,19,16,14,13,11,10,7,5,4,2,1,0,-1,-3,-5,-7,-9};
        int target = 10;
        String ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    static String binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            //find middle element
            //           int mid = (start+end) /2; //might be possible that (start+end) exceeds range of integers
            int mid = start + (end - start) / 2 ;

            if (target > arr[mid]) {
                end = mid -1;
            }else if (target < arr[mid]) {
                start =  mid +1;
            }else {
                //and found
                return "the number "+target+" is present at "+mid+"th position";
            }
        }
        return "No such number is present";
    }
}
