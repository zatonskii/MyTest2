package ru.zatonskii.arrayTest;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] cat_3 = {33, 11, 15, 55};
        int[] cat_4 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        int[] cat_5 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        Arrays.sort(cat_4);

        System.out.println(cat_3.length);
        System.out.println(Arrays.toString(cat_4));
        System.out.println(Arrays.binarySearch(cat_4, 21));
        System.out.println(Arrays.equals(cat_4, cat_5));
        Arrays.fill(cat_5, 905);
        System.out.println(Arrays.toString(cat_5));
    }
}
