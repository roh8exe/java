import java.util.Arrays;

public class Overloading3 {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        fun("rohit","rahul","rohan");
    }
    static void fun(int ...v){
        System.out.println("the first");
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println("the second");
        System.out.println(Arrays.toString(v));
    }
}
