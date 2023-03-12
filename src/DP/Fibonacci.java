package DP;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("FibR : "+fibR(n));
        System.out.println("FibM : "+fibM(n));
        System.out.println("FibDP : "+fibDP(n));
    }
    public static int fibR(int n){
        if(n==0 || n==1){
            return n;
        }else {
            return fibR(n - 1) + fibR(n - 2);
        }
    }
    public static int fibM(int n){
        int storage[] = new int[n+1];
        for(int i=0;i<=n;i++){
            storage[i] = -1;
        }
        return fibM(n,storage);
    }
    public static int fibM(int n, int[] storage){
        if(n==0 || n==1){
            return n;
        }
        if(storage[n]!=-1){
            return storage[n];
        }
        storage[n] = fibM(n-1,storage) + fibM(n-2,storage);
        return storage[n];
    }
    public static int fibDP(int n){
        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2;i<=n;i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
}
