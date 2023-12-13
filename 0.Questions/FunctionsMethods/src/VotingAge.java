import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = in.nextInt();
        vote(age);
    }
    static void vote(int num){
        if (num>=18) {
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("You are not eligible for vote.");
        }
    }
}
