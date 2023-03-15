package com.sanskar.leetcode.java.searchsort.easy;

public class BadVersionControl extends VersionControl {
    public BadVersionControl(Integer badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;
        int mid;
        while (i < j) {
            mid = i + ((j - i) / 2);
            if (isBadVersion(mid)) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        BadVersionControl badVersionControl1 = new BadVersionControl(2);
        System.out.println(badVersionControl1.firstBadVersion(5));
    }
}



