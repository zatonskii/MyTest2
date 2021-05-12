package ru.zatonskii.arrayMin;

public class MinArray {
    public static void main(String[] args) {
        DoOne();
        DoTwo();
    }

    public static void DoOne() {
        int [] list = {9, 7, 5, 3, 8, 6, 4, 2, 77, 1, 111, -5};

        int min = list [0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        System.out.println("Min is " + min);
    }

    public static void DoTwo() {
        int [] list = {9, 77, 5, 3, 8, 6, 4, 2, 77, 1, 111, -5, 333, -145};

        int max= list [0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        System.out.println("Max is " + max);
    }
}

