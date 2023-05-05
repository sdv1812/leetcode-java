package com.sanskar.leetcode.java.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)) {
                res.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                res.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i+1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(3));
        System.out.println(fizzBuzz.fizzBuzz(15));
    }
}
