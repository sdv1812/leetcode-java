package com.sanskar.leetcode.java.dynamic.easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSubArrSum = nums[0];
        int maxSubArrSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentSubArrSum = Math.max(num, num + currentSubArrSum);
            maxSubArrSum = Math.max(currentSubArrSum, maxSubArrSum);
        }
        return maxSubArrSum;
    }

    public int maxSubArray2(int[] nums) {
        int currentSubArrSum = 0;
        int maxSubArrSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currentSubArrSum += num;

            if (currentSubArrSum > maxSubArrSum) {
                maxSubArrSum = currentSubArrSum;
            }
            if (currentSubArrSum < 0) {
                currentSubArrSum = 0;

            }
        }
        return maxSubArrSum;
    }

    public static void main(String[] args) {
        MaximumSubarray subarray = new MaximumSubarray();
        System.out.println(subarray.maxSubArray2(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(subarray.maxSubArray2(new int[] {5,4,-1,7,8}));
        System.out.println(subarray.maxSubArray2(new int[] {-1}));
    }
}
