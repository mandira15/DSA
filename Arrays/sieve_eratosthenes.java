package Arrays;
import java.util.*;
public class sieve_eratosthenes {
    // public static boolean isPrime(int n){   //this is for checking whether number is prime or not
    //     for(int i = 2; i*i<=n; i++){
    //         if(n%i == 0) return false;
    //     }
    //     return true;
    // }
    public static int[] isPrime(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i<=n; i++){
            if(isPrime[i]==true){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            if(isPrime[i] == true){
                list.add(i);
            }
        }
        int[] primes = new int[list.size()];
        for(int i = 0; i < list.size(); i++) primes[i] = list.get(i);
        return primes;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(isPrime(30)));
    }
}
