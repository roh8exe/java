//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class _6_MountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { //you are in dec part of array
                //this may be the ans , but look at left
                //this is why end != mid-1
                end = mid;
            } else {
                //you are in asc part of array
                start = mid + 1; // bcoz we know mid+1 element > mid element
            }

        }
        //in the end, start == end and pointing to the largest no bcoz of 2 checks above
        //start and end are always trying to find max element in above 2 cases
        //hence, when they are pointing to just one element, that is the max bcoz that is what check says
        //at every point of time for start & end , they have the best possible ans till that time
        //and if we are saying only one item is remaining,hence bcoz of above line that is best possible ans.
        return start; // or return end as both are equal.
    }
}
