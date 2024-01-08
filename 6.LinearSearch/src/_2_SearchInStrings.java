import java.util.Scanner;

public class _2_SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String name = in.next();
        System.out.print("Enter alphabet to be searched: ");
        char target = in.next().trim().charAt(0);
        System.out.println(search(name , target));
    }
    static boolean search(String str , char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
