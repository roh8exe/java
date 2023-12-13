public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17};
        System.out.println(maxrange(arr, 1, 5));
    }
    static int maxrange(int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

    }
}
