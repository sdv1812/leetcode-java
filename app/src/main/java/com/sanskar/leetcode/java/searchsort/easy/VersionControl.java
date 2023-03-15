package com.sanskar.leetcode.java.searchsort.easy;

import java.util.Random;

public class VersionControl {
    private final Integer badVersion;

    public VersionControl(Integer version) {
        badVersion = version;
    }
    boolean isBadVersion(int version) {
        return version >= this.badVersion;
    }
}
