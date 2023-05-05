package com.sanskar.leetcode.java.dynamic.easy;

public class HouseRobber {

    public int rob(int[] nums) {
        Integer[] memo = new Integer[nums.length + 1];
        return Math.max(robh(0, nums, memo), robh(1, nums, memo));
    }

    private int robh(int i, int[] nums, Integer[] memo) {
        if (i >= nums.length) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }

        memo[i] = Math.max(robh(i + 1, nums, memo), robh(i+2, nums, memo) + nums[i]);
        return memo[i];
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        System.out.println(houseRobber.rob(new int[]{1, 2, 3, 1})); // 4
        System.out.println(houseRobber.rob(new int[]{2, 7, 9, 3, 1})); // 12
        System.out.println(houseRobber.rob(new int[]{20, 7, 9, 3, 1, 10, 30})); // 60
    }
}


