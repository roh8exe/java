public class _9_RotatedSortedArrayDuplicateValues {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findpivotWithDuplicates(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findpivotWithDuplicates(nums);
//if you did not find a pivot, it means the array is not rotated
//then just do normal binary search bcoz array is not rotated
        if (pivot == -1) {
            return binarysearch(nums,target,0,nums.length-1);
        }
//if pivot is found, you have found 2 ascending sorted arrays
        //CASE1
        if (nums[pivot] == target) {
            return pivot;
        }
        //CASE2
        if (target >= nums[0]) {
            return binarysearch(nums,target,0,pivot-1);
        }
        //CASE3
        //if (target <= nums[0]
        return binarysearch(nums,target,pivot+1, nums.length-1);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) {
                end = mid -1;
            }else if (target > arr[mid]) {
                start =  mid +1;
            }else {
                //and found
                return mid;
            }
        }
        return -1;
    }


    static int findpivotWithDuplicates(int[] arr) {
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
        //if elements at middle,start,end are equal then just skip the dupicates
            if (arr[mid]==arr[start] && arr[mid]==arr[end]) {
                //then skip the duplicates
                //NOTE:But what if these elements at start and end were the pivot?
                // then check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                //check if end is pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted , so pivot should be in right
            else if (arr[start] <arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return  -1;
    }
}
