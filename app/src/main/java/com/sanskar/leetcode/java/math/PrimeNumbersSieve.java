package com.sanskar.leetcode.java.math;

public class PrimeNumbersSieve {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] prime = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = true;
                }
            }
        }
        int countPrime = 0;
        for (int i = 2; i < n; i++) {
            if(!prime[i]) {
                countPrime++;
            }
        }
        return countPrime;
    }

    public static void main(String[] args) {
        PrimeNumbersSieve sieve = new PrimeNumbersSieve();
        System.out.println(sieve.countPrimes(25));
    }
    // 2,3,5,7,11,13,17,19,23
}
