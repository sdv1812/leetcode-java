package com.sanskar.leetcode.java.interview;

import java.util.Arrays;

public class ReverseString {
    public String reverseString(String s) {
        char[] res = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            res[s.length() - i - 1] = s.charAt(i);
        }
        return new String(res);
    }

    public static void main(String[] args) {
        String s1 = "Sanskar";
        StringBuilder sb = new StringBuilder();
        System.out.println(s1);
        ReverseString reverseString = new ReverseString();
        String s = reverseString.reverseString(s1);
        System.out.println(s);
    }
}
