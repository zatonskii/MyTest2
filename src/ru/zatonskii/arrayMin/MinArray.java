package ru.zatonskii.arrayMin;

public class MinArray {
    public static void main(String[] args) {
        DoOne();
        DoTwo();

        ArrayPlus();
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

    public static void RandomArray() {
        int [] arrayList = new int[8];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = (int) (Math.random() * 10);
            System.out.print(arrayList[i]);
            System.out.println(" ");
        }
    }
    public static void ArrayPlus() {
        int[] arrayPl ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int plus = arrayPl.length;
        for (int i = 0; i < plus; i++) {
            if (arrayPl[i] < 6) arrayPl[i] = arrayPl[i] * 2;
        }
        for (int i = 0; i < plus; i++)
        System.out.println(arrayPl[i]);
    }
}

