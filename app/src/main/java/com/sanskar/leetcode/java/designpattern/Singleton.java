package com.sanskar.leetcode.java.designpattern;

public class Singleton {
    private static Singleton s = null;

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }

    private Singleton() {
    }


}
