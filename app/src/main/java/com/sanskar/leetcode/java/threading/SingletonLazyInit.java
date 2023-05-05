package com.sanskar.leetcode.java.threading;

public class SingletonLazyInit {
    private static SingletonLazyInit singletonLazyInit = null;

    private SingletonLazyInit() {}

    public static SingletonLazyInit getInstance() {
       if (singletonLazyInit == null) {
           synchronized (SingletonLazyInit.class) {
               if (singletonLazyInit == null) {
                   singletonLazyInit = new SingletonLazyInit();
               }
           }
       }
       return singletonLazyInit;
    }
}
