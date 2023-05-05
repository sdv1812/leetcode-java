package com.sanskar.leetcode.java.math;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & n-1;
        }
        return sum;
    }

    public int hammingWeight2(int n) {
        int mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            mask = mask << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        System.out.println(numberOf1Bits.hammingWeight(11));
        System.out.println(numberOf1Bits.hammingWeight(128));
        System.out.println(numberOf1Bits.hammingWeight(-3));
        System.out.println(numberOf1Bits.hammingWeight(1));
        System.out.println(numberOf1Bits.hammingWeight(2));
        System.out.println(numberOf1Bits.hammingWeight(3));
        System.out.println(numberOf1Bits.hammingWeight(4));
        System.out.println(numberOf1Bits.hammingWeight(7));
        System.out.println(numberOf1Bits.hammingWeight(15));
        System.out.println("=======================");

        System.out.println(numberOf1Bits.hammingWeight2(11));
        System.out.println(numberOf1Bits.hammingWeight2(128));
        System.out.println(numberOf1Bits.hammingWeight2(-3));
        System.out.println(numberOf1Bits.hammingWeight2(1));
        System.out.println(numberOf1Bits.hammingWeight2(2));
        System.out.println(numberOf1Bits.hammingWeight2(3));
        System.out.println(numberOf1Bits.hammingWeight2(4));
        System.out.println(numberOf1Bits.hammingWeight2(7));
        System.out.println(numberOf1Bits.hammingWeight2(15));
        System.out.println("=======================");

        System.out.println(15 & 14 & 13 & 12 & 11 & 10 & 9 & 8 & 7);
        System.out.println(Integer.bitCount(10));
        System.out.println(Integer.toBinaryString(10));
        System.out.println("=======================");
        System.out.println(Integer.bitCount(-3));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println("=======================");
    }
}
