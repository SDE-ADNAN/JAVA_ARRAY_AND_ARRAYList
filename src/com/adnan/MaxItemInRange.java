package com.adnan;

public class MaxItemInRange {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,65};
        System.out.println(max(arr, 2, 4));
    }
    static int max(int[] arr , int lowerIndex , int upperIndex){
        int maxVal = arr[0];
        for (int i = lowerIndex; i <= upperIndex ; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
