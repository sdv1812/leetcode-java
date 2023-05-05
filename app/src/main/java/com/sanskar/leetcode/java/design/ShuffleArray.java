package com.sanskar.leetcode.java.design;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ShuffleArray {

    private int[] nums;
    private final int[] original;
    public ShuffleArray(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
    }

    public int[] reset() {
        this.nums = this.original.clone();
        return this.nums;
    }

    public int[] shuffle() {
        Random random = new Random();

        for (int i = 0; i <  this.nums.length; i++) {
            int rando = random.ints(i, this.nums.length).findFirst().orElseThrow();
            int temp = this.nums[i];
            this.nums[i] = this.nums[rando];
            this.nums[rando] = temp;
        }
        return this.nums;
    }

    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        shuffleArray.shuffle();
        System.out.println(Arrays.toString(shuffleArray.nums));
        shuffleArray.shuffle();
        System.out.println(Arrays.toString(shuffleArray.nums));
        shuffleArray.reset();
        System.out.println(Arrays.toString(shuffleArray.nums));

    }
}
