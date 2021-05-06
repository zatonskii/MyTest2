package ru.zatonskii.test3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        for (int cat = 0; cat < 10; cat++) {
            for (int j = 0; j < cat; j++) {
                System.out.print("*");
            }
            System.out.println(" Cat = " + cat);
        }
    }
}
