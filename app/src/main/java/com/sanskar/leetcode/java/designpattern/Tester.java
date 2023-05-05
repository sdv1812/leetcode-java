package com.sanskar.leetcode.java.designpattern;

public class Tester {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }

}
