public class Greeting3 {
    public static void main(String[] args) {
        String personalised= myGreet("Rohit Bansal");
        System.out.println(personalised);
    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
