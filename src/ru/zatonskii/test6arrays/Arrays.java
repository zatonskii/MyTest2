package ru.zatonskii.test6arrays;

public class Arrays {
    public static void main(String[] args) {
        arrayCats();
        arrayFill();
        arrayNull();
    }

    public static void arrayCats() {
        int[] cats = new int[5];

        cats[0] = 4;
        cats[1] = 5;
        cats[2] = 1;
        cats[3] = (int) 15.5;
        cats[4] = (int) 10.1;

        System.out.println("вес кота " + cats[0] + " килограмм");
        System.out.println("вес кота " + cats[1] + " килограмм");
        System.out.println("вес кота " + cats[2] + " килограмм");
        System.out.println("вес кота " + cats[3] + " килограмм");
        System.out.println("вес кота " + cats[4] + " килограмм");
    }

    public static void arrayFill() {
        int[] array = new int[5];

        for (int i = 0; i <array.length; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }

    public static void arrayNull() {
        String array0[] = new String[5];

        for (int i = 0; i <array0.length; i++) {
            System.out.print("\n" + array0[i]);
        }
    }
}
