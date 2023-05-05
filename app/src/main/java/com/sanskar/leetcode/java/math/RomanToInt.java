package com.sanskar.leetcode.java.math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> romanToNumMap = new HashMap<>();
        romanToNumMap.put("I", 1);
        romanToNumMap.put("V", 5);
        romanToNumMap.put("X", 10);
        romanToNumMap.put("L", 50);
        romanToNumMap.put("C", 100);
        romanToNumMap.put("D", 500);
        romanToNumMap.put("M", 1000);
        romanToNumMap.put("IV", 4);
        romanToNumMap.put("IX", 9);
        romanToNumMap.put("XL", 40);
        romanToNumMap.put("XC", 90);
        romanToNumMap.put("CD", 400);
        romanToNumMap.put("CM", 900);
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int start = i;
            int end = i + 2 > s.length() ? i + 1  : i + 2;
            String romanLetter = s.substring(start, end);
            if (romanToNumMap.containsKey(romanLetter)) {
                number += romanToNumMap.get(romanLetter);
                i++;
            } else {
                romanLetter = s.substring(start, end - 1);
                number += romanToNumMap.get(romanLetter);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        String s = "sanskar";
        System.out.println(s.substring(0,2));
        RomanToInt romanToInt = new RomanToInt();
        System.out.println("III = " + romanToInt.romanToInt("III"));
        System.out.println("LVIII = " + romanToInt.romanToInt("LVIII"));
        System.out.println("MCMXCIV = " + romanToInt.romanToInt("MCMXCIV"));
    }
}
