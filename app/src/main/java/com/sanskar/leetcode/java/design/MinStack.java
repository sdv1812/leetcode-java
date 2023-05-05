package com.sanskar.leetcode.java.design;

import java.util.*;

class MinStack {

    private final Deque<Integer> minStack;
    private final Deque<Integer> stack;


    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || minStack.peek() >= val ) {
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(minStack.peek().equals(stack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public void printStack() {
        System.out.println(stack);
        System.out.println(minStack);
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.printStack();
        minStack.push(33);
        minStack.push(-1);
        minStack.push(100);
        minStack.printStack();
        System.out.println("minimum = " + minStack.getMin());
        System.out.println("top = " + minStack.top());
        minStack.pop();
        minStack.pop();
        minStack.printStack();
        System.out.println("minimum = " + minStack.getMin());
        System.out.println("top = " + minStack.top());
    }
}