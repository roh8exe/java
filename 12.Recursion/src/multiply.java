public class multiply {
    public static void main(String[] args) {
        int mu = multiplication(2, 3);
        System.out.println(mu);
    }
        static int multiplication ( int a, int b){
            int sum=0;
            for (int i = 1; i <= a; i++) {
                 sum += b;
            }
            return sum;
        }
    }
