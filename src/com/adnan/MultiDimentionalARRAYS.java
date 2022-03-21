package com.adnan;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalARRAYS {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

 ;// here in the first bracket goes the no.of rows and in the second
                                   // bracket goes for no.of columns (rows are mandatory to provide but
                                   // columns are not mandatory;

//        or u can store in easy way to understandable syntax
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };

//        or
//        int[][] arr2 = { //the array with variable columns;
//                {1,2,3},// 0th index
//                {4,5},// 1st index
//                {6,7,8,9},// 2nd index -> arr[2][] = {6,7,8,9}
//        };

        int[][] arr = new int[3][2];
        // inputs in 2d arrays:
        for (int rows = 0; rows < arr.length; rows++) { // arr.length in case of multidimensional arrays gives no of rows
//            arr2 [rows] = in.next();
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = in.nextInt();
            }
        }

        System.out.println(Arrays.toString(arr[0]));




    }
}
