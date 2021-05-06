package ru.zatonskii.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int maxNumber = 20;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Серия фибоначчи  из "+maxNumber+" чисел: ");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber+" ");


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}
