import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //trim removes all extra spaces
        //chatAT(0) PRINTS THE LETTER OF THAT POSITION
        //&& means both conditions to be true
        // || MEANS OR MEANS EITHER ONE CONDITION TO BE TRUE
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch<='z' ){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}


