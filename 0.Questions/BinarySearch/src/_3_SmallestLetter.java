//https://leetcode.com/problems/find-smallest-letter-greater-than-target/solutions/
public class _3_SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        String ans = smallestletter(letters,target);
        System.out.println(ans);
    }

    static String smallestletter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while (start<=end) {
            int mid = start + (end - start) / 2 ;
            if (target < letters[mid]) {
                end = mid -1;
            }else {
                start =  mid +1;
            }
        }
        return "The smallest letter greater than targeted letter is present at index no: " + letters[start % letters.length];
    }

}
