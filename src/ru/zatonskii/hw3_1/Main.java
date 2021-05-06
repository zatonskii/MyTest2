package ru.zatonskii.hw3_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        taskOne();

    }

    public static void taskOne() {

        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};
        try {
            swapTwoElementsInArray(iArray, 0, 2);
            swapTwoElementsInArray(dArray, 0, 2);
            swapTwoElementsInArray(sArray, 0, 2);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Swap result in integer array: " + Arrays.toString(iArray));
        System.out.println("Swap result in double array: " + Arrays.toString(dArray));
        System.out.println("Swap result in string array: " + Arrays.toString(sArray));
    }

    private static void swapTwoElementsInArray(Object[] array, int firstNumPos, int secondNumPos) throws WrongPositionException {
        if (firstNumPos < 0 || firstNumPos > array.length ||
                secondNumPos < 0 || secondNumPos > array.length || firstNumPos == secondNumPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
    }
}
