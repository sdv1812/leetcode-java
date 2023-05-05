package com.sanskar.leetcode.java.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {

        return (Math.log(n) / Math.log(3) + 0.00001) % 1 <= 2 * 0.00001;
    }

    public static void main(String[] args) {
//        System.out.println(Math.log10(-1.0));
//        System.out.println(Math.log(1));
        PowerOfThree powerOfThree = new PowerOfThree();
        System.out.println(powerOfThree.isPowerOfThree(45));
//        System.out.println(powerOfThree.isPowerOfThree(-1));
//        System.out.println(powerOfThree.isPowerOfThree(1));
//        System.out.println(powerOfThree.isPowerOfThree(0));
//        System.out.println(powerOfThree.isPowerOfThree(27));
//        System.out.println(powerOfThree.isPowerOfThree(81));
    }
}
