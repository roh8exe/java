public class _2_FloorOfNumber {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {-9,-8,-7,-6,0,1,2,3,4,5,6,10,14,34,44};
        int target = -10;
        String ans = floor(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    //floor:the greatest number smaller or equal to target number.
    //return the index of greatest no <= target
    static String floor(int[] arr, int target) {

        if (target < arr[arr.length -1]) {
            return "No Floor Number found";
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
        return "the Floor of the number is present at index no: "+end;
    }
}
