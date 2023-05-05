package com.sanskar.leetcode.java.dynamic.easy;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionLearn {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2,3,4,5,6);
        List<Integer> list2 = Stream.of(1, 2,3,4).toList();
        List<Integer> list3 = List.of(1,2,3,4,5);
        List<Integer> list4 = Collections.unmodifiableList(list1);
        List<Integer> copyList1 = List.copyOf(list1);
    }
}
