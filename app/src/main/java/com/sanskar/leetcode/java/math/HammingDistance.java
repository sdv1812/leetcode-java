package com.sanskar.leetcode.java.math;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public static void main(String[] args) {
        String s = "wee";
        int sl = s.length();
        int[] arr = new int[10];
        int l = arr.length;
        HammingDistance h1 = new HammingDistance();
        HammingDistance h2 = new HammingDistance();
        System.out.println(h1.equals(h2));
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1, 4));
        System.out.println(hammingDistance.hammingDistance(3, 1));
    }
}
