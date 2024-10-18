package com.sahil;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n +1];// to include 40 we write n+1 since array starts from indexf 0
        sieve(n, primes);

    }

    //false in array means number is primes
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i * i <= n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    primes[j] = true;

                }

            }

        }

        for (int i = 2; i <= n ; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }

        }
    }

}
