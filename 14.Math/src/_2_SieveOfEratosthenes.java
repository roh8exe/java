import java.util.Scanner;

public class _2_SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the number:- ");
        int n = in.nextInt();
        boolean[] primes  = new boolean[n+1];
        sieve(n,primes);


    }
    //false in array means number is prime
    static void sieve(int n , boolean[] primes){
        for(int i =2; i*i <= n; i++){
            if(!primes[i]){
                for(int j = i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i =2; i<=n; i++){
            if(!primes[i]){
                System.out.println(i+ " ");
            }
        }
    }
}
