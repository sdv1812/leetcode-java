package com.sanskar.leetcode.java.threading;

public class DeadlockTest {
    private final static String R1 = "String 1";
    private final static String R2 = "String 2";

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (R1) {
                System.out.println("Thread T1 locked ->   Resource R1");
                synchronized (R2) {
                    System.out.println("Thread T1 locked -> Resource R2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (R2) {
                System.out.println("Thread T2 locked -> Resource R2");
                synchronized (R1) {
                    System.out.println("Thread T2 locked -> Resource R1");
                }
            }
        });

        t1.start();
        t2.start();

    }
}
