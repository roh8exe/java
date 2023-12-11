public class Overloading2 {
    public static void main(String[] args) {
       int ans= sum(3,4,9);
        System.out.println(ans);

    }
    static int sum(int a ,int b){
        System.out.println("the first");
        return a+b;
    }
    static int sum(int a , int b , int c){
        System.out.println("the second");
        return a+b+c;
    }
}
