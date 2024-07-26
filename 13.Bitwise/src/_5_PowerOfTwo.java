public class _5_PowerOfTwo {
    public static void main(String[] args) {
        int n =44; // fix for n= 0
        boolean ans  = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
