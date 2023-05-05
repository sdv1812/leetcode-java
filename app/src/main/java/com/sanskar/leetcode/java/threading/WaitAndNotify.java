package com.sanskar.leetcode.java.threading;

public class WaitAndNotify {
    static class Process {
        public void produce() throws InterruptedException {
            synchronized (this) {
                System.out.println("Producing...");
                wait();
                System.out.println("producing again...");
            }
        }

        public void consume() throws InterruptedException {
            Thread.sleep(1000);
            synchronized (this) {
                System.out.println("consuming...");
                notifyAll();
                System.out.println("still consuming...");
            }
        }
    }

    public static void main(String[] args) {
        Process process = new Process();
        Thread t1 = new Thread(() -> {
            try {
                process.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                process.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                process.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
