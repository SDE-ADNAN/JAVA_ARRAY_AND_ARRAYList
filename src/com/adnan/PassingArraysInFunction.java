package com.adnan;

import java.util.Arrays;

public class PassingArraysInFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void change(int[] arr) {
        arr[0]= 99;
    }
}
