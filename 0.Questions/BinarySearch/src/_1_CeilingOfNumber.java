public class _1_CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {-9,-8,-7,-6,0,1,2,3,4,5,6,10,14,34,44};
        int target = 11;
        String ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    //ceiling: smallest number greater than or equal to target number.
    //return the index of smallest no >= target
    static String ceiling(int[] arr, int target) {

        //but what if target is greater than greatest no in array
        if (target > arr[arr.length-1]) {
            return "No Ceiling Number found";
        }
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            //find middle element
            //           int mid = (start+end) /2; //might be possible that (start+end) exceeds range of integers
            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) {
                end = mid -1;
            }else if (target > arr[mid]) {
                start =  mid +1;
            }else {
                //and found
                return "the number "+target+" is present at "+mid+"th position";
            }
        }
        return "the ceiling of the number is present at index no: "+start; //the smallest number greater than the targeted number.
    }
}

