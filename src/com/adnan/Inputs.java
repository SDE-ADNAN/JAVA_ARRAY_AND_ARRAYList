package com.adnan;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] =23;
//        arr[1] =233;
//        arr[2] =223;
//        arr[3] =213;
//        arr[4] =123;
//        [23, 233, 223, 213, 123]
//        System.out.println(arr[2]);
//        System.out.println(Arrays.toString(arr));
        
//        array inputs using forloop:
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        for (int num : arr) { // here num represents individual item of the arr array:
//            System.out.print(num + " "); // for every element in the arr print the element:
//        }
//
//
//        System.out.println(arr[8]); // this will give the IndexOutOfBound exeption;



        // array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
