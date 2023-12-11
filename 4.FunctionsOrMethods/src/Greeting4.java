import java.util.Scanner;

public class Greeting4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=in.next();
        String personalised= myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name) { // it is not necessary to write name at Sring name , you can write anything.
        String message = "Hello " + name;
        return message;
    }
}
 