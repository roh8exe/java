public class Shadowing {
    static int x =90; //this will be shadowed at line6
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40; // the class var at line2 is shadowed by this
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
