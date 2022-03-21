package com.adnan;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(2311);
//        list.add(2322);
//        list.add(23);
//        list.add(232423);
//        list.add(2223);
//        list.add(2333);
//        list.add(232);
//
//
//        System.out.println(list);
//        System.out.println(list.contains(2311));
//        System.out.println(list.size());
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item with help of index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }
}
