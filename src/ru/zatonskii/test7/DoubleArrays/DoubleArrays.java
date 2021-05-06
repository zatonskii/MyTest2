package ru.zatonskii.test7.DoubleArrays;

public class DoubleArrays {
    public static void main(String[] args) {
        array4x4();
        twoDiArrays();
    }
    public static void array4x4() {
        int[] [] doubleArray = new int[4][4];

        doubleArray[0] [0] = 1;
        doubleArray[0] [1] = 2;
        doubleArray[0] [2] = 3;
        doubleArray[0] [3] = 4;

        doubleArray[1] [0] = 5;
        doubleArray[1] [1] = 6;
        doubleArray[1] [2] = 7;
        doubleArray[1] [3] = 8;

        doubleArray[2] [0] = 9;
        doubleArray[2] [1] = 10 ;
        doubleArray[2] [2] = 11 ;
        doubleArray[2] [3] = 12 ;

        doubleArray[3] [0] = 13 ;
        doubleArray[3] [1] = 14 ;
        doubleArray[3] [2] = 15 ;
        doubleArray[3] [3] = 16 ;

        System.out.print(doubleArray[0] [0]);
        System.out.print(doubleArray[0] [1]);
        System.out.print(doubleArray[0] [2]);
        System.out.print(doubleArray[0] [3]);
        System.out.print("\n");

        System.out.print(doubleArray[1] [0]);
        System.out.print(doubleArray[1] [1]);
        System.out.print(doubleArray[1] [2]);
        System.out.print(doubleArray[1] [3]);
        System.out.print("\n");

        System.out.print(doubleArray[2] [0]);
        System.out.print(doubleArray[2] [1]);
        System.out.print(doubleArray[2] [2]);
        System.out.print(doubleArray[2] [3]);
        System.out.print("\n");

        System.out.print(doubleArray[3] [0]);
        System.out.print(doubleArray[3] [1]);
        System.out.print(doubleArray[3] [2]);
        System.out.print(doubleArray[3] [3]);
        System.out.println("\n");
    }
    private static void twoDiArrays() {
        int sizeA = 3;
        int sizeZ = 3;
        int[] [] arraySize = new int[sizeA][sizeZ];

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeZ; j++) {
                arraySize[i] [j] = i * j +1;
            }
        }
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeZ; j++) {
                System.out.print(" " + arraySize[i] [j]);
            }
            System.out.print("\n");
        }
        System.out.println(arraySize);
    }
}
